package com.neppplus.jickbangcopy_20220217

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20220217.datas.RoomData

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(RoomData(8000,"서울시 동대문구", 7,"1번째 방입니다"))
        mRoomList.add(RoomData(7000,"서울시 강동구", 6,"2번째 방입니다"))
        mRoomList.add(RoomData(6000,"서울시 송파구", 5,"3번째 방입니다"))
        mRoomList.add(RoomData(10000,"서울시 강북구", 4,"4번째 방입니다"))
        mRoomList.add(RoomData(120000,"서울시 강남구", 3,"5번째 방입니다"))
        mRoomList.add(RoomData(3000,"서울시 중랑구", 2,"6번째 방입니다"))
        mRoomList.add(RoomData(2300,"서울시 동작구", 1,"7번째 방입니다"))
        mRoomList.add(RoomData(1000,"서울시 양천구", -1,"8번째 방입니다"))
        mRoomList.add(RoomData(900,"서울시 금천구", -2,"9번째 방입니다"))
        mRoomList.add(RoomData(80000,"서울시 동대문구", 10,"10번째 방입니다"))

    }
}