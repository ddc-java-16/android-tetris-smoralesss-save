package edu.cnm.deepdive.tetris.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import edu.cnm.deepdive.tetris.R;
import edu.cnm.deepdive.tetris.adapter.UserScoresAdapter.Holder;
import edu.cnm.deepdive.tetris.databinding.ItemUserScoreBinding;
import edu.cnm.deepdive.tetris.model.pojo.UserScore;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;

public class UserScoresAdapter extends RecyclerView.Adapter<Holder> {

  private final Context context;
  private final List<UserScore> scores;
  private final LayoutInflater inflater;
  private final DateTimeFormatter formatter;
  @ColorInt
  private final int oddRowBackground;
  @ColorInt
  private final int evenRownBackground;


  public UserScoresAdapter(Context context, List<UserScore> scores) {
    this.context = context;
    this.scores = scores;
    inflater = LayoutInflater.from(context);
    formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT);
    oddRowBackground = context.getColor(R.color.odd_row_background);
    evenRownBackground = context.getColor(R.color.even_row_background);
  }

  @NonNull
  @Override
  public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return new Holder(ItemUserScoreBinding.inflate(inflater, parent, false));
  }

  @Override
  public void onBindViewHolder(@NonNull Holder holder, int position) {
    holder.bind(position, scores.get(position));
  }

  @Override
  public int getItemCount() {
    return scores.size();
  }

  public class Holder extends RecyclerView.ViewHolder {

    private final ItemUserScoreBinding binding;

    private Holder(@NonNull ItemUserScoreBinding binding) {
      super(binding.getRoot());
      this.binding = binding;
    }

    private void bind(int position, UserScore score) {
      // TODO: 10/26/23 Bind the widgets in the view to the properties of the score.
    }

  }

}
