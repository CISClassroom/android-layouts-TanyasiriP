# รายงานผลการทดลอง

<นางสาวธัญสิริ ผลไสว> <603410291-5>

## Relative Layout

แสดง Control `title` และ `Detail`

```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".ReletiveActivity">
    //layout ก่อนยุคปัจจุบัน

    <EditText
        android:id="@+id/editText4"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="textPersonName"
        android:text="Name" />

    <EditText
        android:id="@+id/editText5"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="textPersonName"
        android:layout_below="@id/editText4"
        android:text="Name" />

    <Button
        android:id="@+id/button5"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/editText5"
        android:text="Go Back"
        tools:layout_editor_absoluteX="11dp"
        tools:layout_editor_absoluteY="13dp" />
</RelativeLayout>
```

แอดทริบิ้วที่แสดงความสัมพันธ์ระหว่าง control ทั้งสอง

```xml
android:layout_below="@id/editText4" controlให้อยู่ข้างบน editText4
android:layout_below="@id/editText5" controlให้อยู่ข้างล่าง editText5
```

## Linear Layout

แสดง Control `to`, `subject`, `tag` และ `message`

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".LinearActivity"
    android:orientation="vertical">

    <EditText
        android:id="@+id/editText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="textPersonName"
        android:text="Name" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <EditText
            android:id="@+id/editText2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:ems="10"
            android:inputType="textPersonName"
            android:text="Name"
            tools:layout_editor_absoluteX="0dp"
            tools:layout_editor_absoluteY="60dp" />

        <EditText
            android:id="@+id/editText3"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:ems="10"
            android:inputType="textPersonName"
            android:text="Name"
            tools:layout_editor_absoluteX="0dp"
            tools:layout_editor_absoluteY="120dp" />
    </LinearLayout>

    <EditText
        android:id="@+id/editText6"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:ems="10"
        android:gravity="start|top"
        android:inputType="textMultiLine" />

    <Button
        android:id="@+id/button4"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Go Back"
        tools:layout_editor_absoluteX="16dp"
        tools:layout_editor_absoluteY="190dp" />
</LinearLayout>

```

อธิบายความแตกต่างระหว่าง vertical และ horizontal orientation

```
vertical orientation คือการจัดเรียงให้อยู่ในแนวตั้ง
horizontal orientation คือการจัดเรียงให้อยู่ในแนวนอน
```

## Constrant Layout

จงออกแบบและสร้างหน้า Constrant layout สำหรับแสดงข้อมูลนักศึกษา ประกอบไปด้วย รูปโปรไฟล์ รูปพื้นหลัง ชื่อ-นามสกุล รหัสนักศึกษา และเกรดเฉลี่ยรวม

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#CCFFCC"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/button8"
        android:layout_width="match_parent"
        android:layout_height="30dp"
        android:layout_alignParentStart="true"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"

        android:layout_marginStart="50dp"
        android:layout_marginTop="5dp"
        android:layout_marginEnd="50dp"
        android:layout_marginBottom="5dp"
        android:background="#3366FF"
        android:text="Go back"
        android:textColor="#fff"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/linearLayout2" />

    <ImageView
        android:id="@+id/imageView3"
        android:layout_width="476dp"
        android:layout_height="788dp"

        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:layout_alignParentEnd="true"
        android:layout_marginTop="20dp"
        android:layout_marginBottom="20dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:srcCompat="@drawable/gbg" />

    <de.hdodenhof.circleimageview.CircleImageView
        android:id="@+id/image_view"
        android:layout_width="165dp"
        android:layout_height="165dp"

        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:layout_alignParentEnd="true"

        android:layout_marginTop="50dp"
        android:src="@drawable/pf"
        app:civ_border_color="#fff"
        app:civ_border_width="2dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <LinearLayout
        android:id="@+id/linearLayout2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="20dp"
        android:orientation="vertical"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/image_view">

        <TextView
            android:id="@+id/textView"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"

            android:layout_marginStart="0dp"
            android:layout_marginTop="0dp"
            android:layout_marginEnd="0dp"
            android:gravity="center"
            android:text="Tanyasiri Polsawai"
            android:textColor="#000"
            android:textSize="23dp"
            android:textStyle="bold" />

        <TextView
            android:id="@+id/textView2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"

            android:layout_marginStart="0dp"
            android:layout_marginTop="0dp"
            android:layout_marginEnd="0dp"
            android:gravity="center"
            android:text="(Maprang CIS#3)"
            android:textColor="#000"
            android:textSize="18dp" />

        <TextView
            android:id="@+id/textView3"
            android:layout_width="match_parent"
            android:layout_height="38dp"
            android:layout_alignParentStart="true"
            android:layout_alignParentTop="true"
            android:layout_alignParentEnd="true"

            android:layout_marginStart="0dp"
            android:layout_marginTop="5dp"
            android:layout_marginEnd="0dp"
            android:gravity="center"
            android:text="KhonKean University, Nongkhai Campus"
            android:textColor="#3366FF"
            android:textSize="15dp" />

        <TextView
            android:id="@+id/textView4"
            android:layout_width="match_parent"
            android:layout_height="19dp"
            android:layout_alignParentStart="true"
            android:layout_alignParentTop="true"
            android:layout_alignParentEnd="true"

            android:layout_marginStart="0dp"
            android:layout_marginTop="0dp"
            android:layout_marginEnd="0dp"
            android:gravity="center"
            android:text="Faculty of Applied Science and Engineering,"
            android:textColor="#3366FF"
            android:textSize="15dp" />

        <TextView
            android:id="@+id/textView5"
            android:layout_width="match_parent"
            android:layout_height="19dp"
            android:layout_alignParentStart="true"
            android:layout_alignParentTop="true"
            android:layout_alignParentEnd="true"

            android:layout_marginStart="0dp"
            android:layout_marginTop="0dp"
            android:layout_marginEnd="0dp"
            android:gravity="center"
            android:text="Computer and Information Science"
            android:textColor="#3366FF"
            android:textSize="15dp" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="30dp"
            android:orientation="horizontal">

            <TextView
                android:id="@+id/textView6"
                android:layout_width="match_parent"
                android:layout_height="20dp"
                android:layout_alignParentStart="true"
                android:layout_alignParentTop="true"
                android:layout_alignParentEnd="true"

                android:layout_marginStart="0dp"
                android:layout_marginTop="0dp"
                android:layout_marginEnd="0dp"
                android:layout_weight="1"
                android:gravity="center"
                android:text="Student ID."
                android:textColor="#000"
                android:textSize="13dp"
                android:textStyle="bold" />

            <TextView
                android:id="@+id/textView7"
                android:layout_width="match_parent"
                android:layout_height="20dp"
                android:layout_alignParentStart="true"
                android:layout_alignParentTop="true"
                android:layout_alignParentEnd="true"

                android:layout_marginStart="0dp"
                android:layout_marginTop="0dp"
                android:layout_marginEnd="0dp"
                android:layout_weight="1"
                android:gravity="center"
                android:text="GPA"
                android:textColor="#000"
                android:textSize="13dp"
                android:textStyle="bold" />

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="0dp"
            android:orientation="horizontal">

            <TextView
                android:id="@+id/textView11"
                android:layout_width="match_parent"
                android:layout_height="20dp"
                android:layout_alignParentStart="true"
                android:layout_alignParentTop="true"
                android:layout_alignParentEnd="true"

                android:layout_marginStart="0dp"
                android:layout_marginTop="0dp"
                android:layout_marginEnd="0dp"
                android:layout_weight="1"
                android:gravity="center"
                android:text="603410291-5"
                android:textColor="#000"
                android:textSize="15dp" />

            <TextView
                android:id="@+id/textView12"
                android:layout_width="match_parent"
                android:layout_height="20dp"
                android:layout_alignParentStart="true"
                android:layout_alignParentTop="true"
                android:layout_alignParentEnd="true"

                android:layout_marginStart="0dp"
                android:layout_marginTop="0dp"
                android:layout_marginEnd="0dp"
                android:layout_weight="1"
                android:gravity="center"
                android:text="3.43"
                android:textColor="#000"
                android:textSize="15dp" />


        </LinearLayout>

    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>
```
