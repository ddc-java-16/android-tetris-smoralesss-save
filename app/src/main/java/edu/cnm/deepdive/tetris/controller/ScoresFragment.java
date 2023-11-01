package edu.cnm.deepdive.tetris.controller;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.navigation.Navigation;
import edu.cnm.deepdive.tetris.R;
import edu.cnm.deepdive.tetris.databinding.FragmentGameBinding;
import edu.cnm.deepdive.tetris.databinding.FragmentScoresBinding;
import org.jetbrains.annotations.NotNull;

public class ScoresFragment extends Fragment {

  private FragmentScoresBinding binding;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Override
  public View onCreateView(
      @NonNull LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
    binding = FragmentScoresBinding.inflate(inflater, container, false);
    // TODO: 10/17/23 Initialize field contents.
    return binding.getRoot();
  }

  @Override
  public void onViewCreated(@NonNull View view,
      @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    // TODO: 10/17/23 Connect to viewModels and add observers.
    ActionBar actionBar = ((AppCompatActivity) requireActivity()).getSupportActionBar();
    //noinspection DataFlowIssue
    actionBar.setDisplayHomeAsUpEnabled(true);
    actionBar.setDisplayShowHomeEnabled(true);
  }
}