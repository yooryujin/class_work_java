package ch03;

/**
 * 논리 연산자 복습
 */
public class Operation6 {

    // 메인 함수 (코드의 진입점)
    public static void main(String[] args) {

        // 쇼핑몰 회원 정보를 설정

        int userAge = 20;  // 사용자의 나이
        int cartTotal = 50_000;  // 장바구니 총액(원) 정수의 숫자 단위에 _ 언더바 사용가능
        // System.out.println(cartTotal);
        boolean isMember = true;  // 회원 여부
        int couponCount = 2;  // 보유 쿠폰 개수

        // 1. 무료 배송 조건 : 장바구니 총액이 3만원 이상이고 회원이어야 한다.
        boolean freeShipping = (cartTotal >= 30_000) && isMember;
        System.out.println("무료 배송 가능 여부 : " + freeShipping);

        // 2. 할인 조건 : 나이가 19세 이상이거나 쿠폰이 1개 이상 있어야 한다.
        boolean canDiscount = (userAge >= 19) || (couponCount >= 1);
        System.out.println("할인 적용 가능 여부 : " + canDiscount);

        // 3. 구매 제한 조건 : 나이가 19세 미만이고 회원이 아닌 경우 -> &&
        boolean purchaseRestricted = (userAge < 19) && (!isMember);

        // 4. 이벤트 참여 조건 : 장바구니 총액이 5만원 미만이거나 쿠폰이 3개 미만
        boolean canJoinEvent = (cartTotal < 50_000) || (couponCount < 3);
        System.out.println("이벤트 참여 가능 여부 : " + canJoinEvent);

        // 연습문제
        // 1. 직접 문제를 만들고 식을 세워서 출력 하시오

        // 회사 지원 가능 조건
        // 나이 25세 이상, 대졸, 경력 1년차 이상
        // 프로젝트 참여 1회 이상

        int userAge1 = 27;
        boolean collegeGraduation = true;
        int personalHistory = 1;
        int project = 2;

        boolean user = (userAge1 >= 25) && (collegeGraduation) && (personalHistory >= 1) && (project >=1);
        System.out.println("회사 지원 가능 여부 : " + user);

    } // end of main
} // end of class
