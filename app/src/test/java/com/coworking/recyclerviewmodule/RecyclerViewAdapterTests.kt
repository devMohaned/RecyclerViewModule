package com.coworking.recyclerviewmodule

import android.R
import android.content.Context
import com.coworking.recyclerviewmodule.adapters.ItemAdapter
import com.coworking.recyclerviewmodule.models.Item
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class RecyclerViewAdapterTests {
    private val context = mock(Context::class.java)




    @Test
    fun recyclerViewAdapter_hasCorrectSize(){
        val fakeDataSource = listOf<Item>(
            Item("Val Item #1", R.drawable.ic_delete),
            Item("Val Item #2", R.drawable.ic_menu_gallery),
            Item("Val Item #3", R.drawable.ic_partial_secure),
            Item("Val Item #4", R.drawable.ic_dialog_email))

        val adapter = ItemAdapter(context, fakeDataSource)
        assertEquals("ItemAdapter is not the correct size", fakeDataSource.size, adapter.itemCount)

    }


}