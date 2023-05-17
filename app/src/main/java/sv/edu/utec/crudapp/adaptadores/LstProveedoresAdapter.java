package sv.edu.utec.crudapp.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import sv.edu.utec.crudapp.R;
import sv.edu.utec.crudapp.entidades.EntProveedores;

public class LstProveedoresAdapter extends RecyclerView.Adapter<LstProveedoresAdapter.ProveedoresViewHolder> {


    ArrayList<EntProveedores> listaprove;

    public LstProveedoresAdapter(ArrayList<EntProveedores> entProveedores) {

        this.listaprove=entProveedores;
    }

    @NonNull
    @Override
    public LstProveedoresAdapter.ProveedoresViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_proveedores,null,false);
        return new ProveedoresViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LstProveedoresAdapter.ProveedoresViewHolder holder, int position) {

        holder.viewNombre.setText(listaprove.get(position).getNOMPROV());
        holder.viewTelefono.setText(listaprove.get(position).getTELPROV());
        holder.viewCorreo.setText(listaprove.get(position).getCORPROV());

    }

    @Override
    public int getItemCount() {
        return listaprove.size();
    }

    public class ProveedoresViewHolder extends RecyclerView.ViewHolder {
        TextView viewNombre,viewTelefono,viewCorreo;
        public ProveedoresViewHolder(@NonNull View itemView) {
            super(itemView);
            viewNombre=itemView.findViewById(R.id.tvNomProve);
            viewTelefono=itemView.findViewById(R.id.tvTelProve);
            viewCorreo=itemView.findViewById(R.id.tvCorreo);
        }
    }
}
