package com.losecow.word;

public interface ICRUD {
    public Object add();
    //데이터 추가
    public int update(Object obj);
    //데이터 업데이트
    public int delete(Object obj);
    //데이터 삭제
    public void selectOne(int id);
    //데이터 한개 선택
}
//리던 타입이나 파라미터는 작성하는 사람들이 원하는 템플릿에 맞춰서 만들면 된다
// Object 한 이유 추가되었을 때 객체를 리턴하기 위해서 Object 타입을 넣어줌

