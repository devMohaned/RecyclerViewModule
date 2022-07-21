package com.coworking.recyclerviewmodule.data

import com.coworking.recyclerviewmodule.R
import com.coworking.recyclerviewmodule.models.Item

class DataSource {

    fun loadItems(): List<Item>
    {
        return listOf<Item>(
            Item("Val Item #1", android.R.drawable.ic_delete),
            Item("Val Item #2", android.R.drawable.ic_menu_gallery),
            Item("Val Item #3", android.R.drawable.ic_partial_secure),
            Item("Val Item #4", android.R.drawable.ic_dialog_email),
            Item("Val Item #5", android.R.drawable.ic_dialog_dialer),
            Item("Val Item #6", android.R.drawable.ic_lock_lock),
            Item("Val Item #7", android.R.drawable.ic_btn_speak_now),
            Item("Val Item #8", android.R.drawable.ic_menu_add),
            Item("Val Item #9", android.R.drawable.ic_menu_compass)

        )
    }
}