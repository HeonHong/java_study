/*
Java Project : 10_collection

Package      : salary.bean
Class          : SalaryDTO.java

Package      : salary.service
Interface     : Salary.java
추상메소드  : execute
Class          : SalaryWrite.java
                  SalaryPrint.java
                  SalaryUpdate.java
                  SalarySearch.java
                  SalaryDelete.java
                  SalarySort.java

                  SalaryService.java - menu() 작성

Package     : salary.main
Class         : SalaryMain.java

[문제] 월급 계산 프로그램
직원들의 월급을 프로그램을 만들어서 관리하려고 한다.
관리하려는 항목은 사원번호, 이름, 직급, 기본급, 수당, 세율, 월급 이다.
세율(기본급+수당)은 200만원 이하 : 1%(0.01), 
                           400만원 이하 : 2%(0.02), 
                           400만원 초과 : 3%(0.03)으로 설정한다.
월급은 “기본급 + 수당 - (기본급 + 수당) * 세율”로 계산을 한다.

시작화면으로 메뉴를 보여준다.
각 메뉴의 기능은 다음과 같다.P
    등록 : 사원번호, 이름, 직급, 기본급, 수당을 입력받는다.
    출력 : 모든 직원의 이름, 직급, 기본급, 수당, 세율, 월급을 보여준다.
    수정 : 특정 직원의 직급, 기본급, 수당을 입력받아서 수정한다.
    검색 : 이름을 입력하면, 그 직원의 이름, 직급, 기본급, 수당, 세율, 월급을 보여준다.
    삭제 : 사원번호를 입력하여 삭제한다.
    정렬 : 메뉴를 만들어서 이름 오름차순(Comparable) / 월급으로 내림차순(Comparator) 사용한다.
    종료 : 프로그램을 종료한다.

[조건]
1. 사원번호를 중복하지 않는다. (등록시 처리)
2. 직원 1명의 데이터는 자바빈 객체로 처리한다.(DTO 만들 것)
3. 전체 직원의 데이터는 컬렉션으로 처리한다.(ArrayList 사용)
*/

package salary.main;

import salary.SalaryService;

public class SalaryMain{

	public static void main(String[] args) {

		SalaryService salaryService = new SalaryService();
		
		salaryService.menu();
		
		System.out.println("시스템을 종료합니다.");
		
	}

}
