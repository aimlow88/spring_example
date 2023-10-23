package com.example.lesson07.entity;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString             // 객체를 출력할 때 모든 내용이 보여진다.
@AllArgsConstructor   // 파라미터가 모두 있는 생성자
@NoArgsConstructor    // 파라미터가 없는 생성자
@Getter
@Builder(toBuilder = true)  // setter의 대용 "toBuilder = true"는 update까지 하는 것을 추가함
@Entity(name = "new_student")    // 이 객체는 entity이다. (JPA-DB 통신)
@Table(name="new_student")
public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@Column(name="phoneNumber")
	private String phoneNumber;
	
	private String email;
	
	@Column(name="dreamJob")
	private String dreamJob;
	
	@UpdateTimestamp
	@Column(name="createdAt", updatable=false)   // updatable 속성은 업데이트시 자동 업데이트 금지
	private ZonedDateTime createdAt;
	
	@UpdateTimestamp
	@Column(name="updatedAt")
	private ZonedDateTime updatedAt;

}
