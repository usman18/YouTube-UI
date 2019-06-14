package com.uk.youtube_ui.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.uk.youtube_ui.Model.Message;
import com.uk.youtube_ui.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder>{
	
	private Context context;
	private ArrayList<Message> messages;
	
	public MessageAdapter(Context context, ArrayList<Message> messages) {
		this.context = context;
		this.messages = messages;
	}
	
	@NonNull
	@Override
	public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
		return new MessageViewHolder(LayoutInflater.from(context)
		.inflate(R.layout.message_row, viewGroup, false));
	}
	
	@Override
	public void onBindViewHolder(@NonNull MessageViewHolder messageViewHolder, int i) {
		Message message = messages.get(i);
		
		Glide.with(context)
			.load(message.getProfilePic())
			.apply(new RequestOptions().placeholder(R.drawable.profile))
			.into(messageViewHolder.imgProfilePic);
		
		
		messageViewHolder.tvName.setText(message.getName());
		messageViewHolder.tvLastMsg.setText(message.getLastMessage());
		messageViewHolder.tvTimeStamp.setText(message.getTimestamp());
	
		if (message.getSeenBy() != null) {
			String seenBy = " •  Seen by " + message.getSeenBy();
			messageViewHolder.seenBy.setText(seenBy);
		} else {
			messageViewHolder.seenBy.setVisibility(View.GONE);
		}
		
		
	}
	
	@Override
	public int getItemCount() {
		if (messages != null) {
			return messages.size();
		}
		return 0;
	}
	
	class MessageViewHolder extends RecyclerView.ViewHolder {
		TextView tvName;
		CircleImageView imgProfilePic;
		TextView tvLastMsg;
		TextView tvTimeStamp;
		TextView seenBy;
		
		
		MessageViewHolder(@NonNull View itemView) {
			super(itemView);
		
			tvName = itemView.findViewById(R.id.tvName);
			imgProfilePic = itemView.findViewById(R.id.imgProfilePic);
			tvLastMsg = itemView.findViewById(R.id.tvLastMessage);
			tvTimeStamp = itemView.findViewById(R.id.tvTimeStamp);
			seenBy = itemView.findViewById(R.id.tvSeenBy);
		}
	}
}
