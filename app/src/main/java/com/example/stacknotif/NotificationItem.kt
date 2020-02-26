package com.example.stacknotif

// kelas ini berfungsi sebagai holder untuk notifikasi yang akan kita gunakan,
// Ia akan berisikan nama pengirim dan isi pesan dari sebuah notifikasi
data class NotificationItem (
     var id: Int,
     var sender: String?,
     var message: String?
)