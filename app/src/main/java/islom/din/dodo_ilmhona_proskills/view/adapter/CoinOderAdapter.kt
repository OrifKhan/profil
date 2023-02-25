package islom.din.dodo_ilmhona_proskills.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.order.Pizza
import islom.din.dodo_ilmhona_proskills.R
import islom.din.dodo_ilmhona_proskills.databinding.ItemCointOrderBinding

class CoinOderAdapter:ListAdapter<Pizza, CoinOderAdapter.CoinViewHolder>(OrderDiffUnits()) {
    inner class CoinViewHolder(itemView: View):ViewHolder(itemView){
       private val binding = ItemCointOrderBinding.bind(itemView)
        fun bind(pizza: Pizza){
            binding.coinOrderName.text= pizza.name
            binding.coinOrderPice.text=pizza.price.toString()
            binding.coinOrderDisciption.text=pizza.about
            binding.oderCoinImag.setImageResource(pizza.image)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinViewHolder {
        return CoinViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_coint_order,parent,false))
    }

    override fun onBindViewHolder(holder: CoinViewHolder, position: Int) {
   holder.bind(getItem(position))
    }
}