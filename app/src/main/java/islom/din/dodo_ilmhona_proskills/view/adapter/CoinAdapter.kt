package islom.din.dodo_ilmhona_proskills.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.order.Pizza
import islom.din.dodo_ilmhona_proskills.R
import islom.din.dodo_ilmhona_proskills.databinding.ViewpagerItemLayoutBinding

class CoinAdapter : ListAdapter<Pizza, CoinAdapter.CoinViewHolder>(OrderDiffUnits()) {
    var onClick: (Int) -> (Unit) = { }

    inner class CoinViewHolder(itemView: View) : ViewHolder(itemView) {
        private val binding = ViewpagerItemLayoutBinding.bind(itemView)

        init {
            binding.root.setOnClickListener {
                onClick(adapterPosition)
            }
        }

        fun bind(pizza: Pizza) {
            binding.coinImage.setImageResource(pizza.image)
            binding.coinName.text = pizza.name
            binding.coinPrice.text = pizza.price.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinViewHolder {
        return CoinViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.viewpager_item_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CoinViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}