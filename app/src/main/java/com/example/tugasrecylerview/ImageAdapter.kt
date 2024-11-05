package com.example.tugasrecylerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.tugasrecylerview.databinding.ItemImageBinding

class ImageAdapter(private val context: Context) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    // Daftar gambar yang akan ditampilkan
    private val imageList: List<Int> = listOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
        R.drawable.image6,
    )

    private val imageNames = listOf(
        "Image 1",
        "Image 2",
        "Image 3",
        "Image 4",
        "Image 5",
        "Image 6"
    )


    inner class ImageViewHolder(val binding: ItemImageBinding) : RecyclerView.ViewHolder(binding.root)

    // Membuat ViewHolder untuk setiap item gambar
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val binding = ItemImageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImageViewHolder(binding)
    }

    // Mengikat data gambar ke ViewHolder
    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.binding.imageView.setImageResource(imageList[position])

        // Mengatur deskripsi gambar berdasarkan nama gambar
        holder.binding.imageView.setOnClickListener {
            Toast.makeText(context, imageNames[position], Toast.LENGTH_SHORT).show()
        }
    }

    // Mengembalikan jumlah item dalam daftar gambar
    override fun getItemCount() = imageList.size
}
