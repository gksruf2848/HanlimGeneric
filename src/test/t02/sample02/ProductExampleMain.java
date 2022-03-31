package test.t02.sample02;

import test.t02.common.Car;
import test.t02.common.Tv;

public class ProductExampleMain {
    public static void main(String[] args) {
        Product<Car, String> product1 = new Product<>(new Car("Kiea"), "small");
        System.out.println(">>>>> product1 :" + product1);

        Product<Tv, String> product2 = new Product<>(new Tv("Samsung"), "small");
        System.out.println(">>>>> product2 :" + product2);
    }
}











//FIFO
//스레드가 아니어도 된다
//restApiQueue 방식으로 함.
//캠페인 시작 전에는 추가, 수정 가능
//캠페인 시작 후 오류 발견, 기존에는 캠페인이 실행되고 있을 때는 수정이 불가능했는데 , 가능하도록 로직 보완
//매일매일 반복되는 캠페인들
//11번가의 문제점 : 캠페인 코드별로의 분석 결과가 없음

//처음부터 다시 디자인 ~??


//2) 개인화 API 푸시의 신규 jar 파일 지원
// 푸시에서 사용하는 jar 변경처리
// 발송 건수가 많아도 제한내 시간내 처리되도록 로직 변경 처리
// id값 누락 보완
// 테스트 발송에서도 정상 처리되도록 로직 보완
// 테스트 캠페인을 위해서 소소의 대상자일 경우에도 발송처리 되도록 로직 보완

//Spring Batch
//Spring Boot 이용한 Spring Batch 서버 (Sample code)
// ~특정 시간에 shell 파일 실헹하는 기능
//Spring Boot 이용한 REST API 처리하는 서버
// ~온전한 코드가 필요함
