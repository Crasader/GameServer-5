package com.game.lll.protobuf;

//Generated by the protocol buffer compiler.  DO NOT EDIT!
//source: Player.proto

public final class Player {
	private Player() {}
	public static void registerAllExtensions(
			com.google.protobuf.ExtensionRegistry registry) {
	}
	public interface loginOrBuilder extends
	// @@protoc_insertion_point(interface_extends:login)
	com.google.protobuf.MessageOrBuilder {

		/**
		 * <code>required string username = 1;</code>
		 *
		 * <pre>
		 * 用户名（必需）
		 * </pre>
		 */
		boolean hasUsername();
		/**
		 * <code>required string username = 1;</code>
		 *
		 * <pre>
		 * 用户名（必需）
		 * </pre>
		 */
		String getUsername();
		/**
		 * <code>required string username = 1;</code>
		 *
		 * <pre>
		 * 用户名（必需）
		 * </pre>
		 */
		com.google.protobuf.ByteString
		getUsernameBytes();

		/**
		 * <code>required string password = 2;</code>
		 *
		 * <pre>
		 * 密码（必需）
		 * </pre>
		 */
		boolean hasPassword();
		/**
		 * <code>required string password = 2;</code>
		 *
		 * <pre>
		 * 密码（必需）
		 * </pre>
		 */
		String getPassword();
		/**
		 * <code>required string password = 2;</code>
		 *
		 * <pre>
		 * 密码（必需）
		 * </pre>
		 */
		com.google.protobuf.ByteString
		getPasswordBytes();
	}
	/**
	 * Protobuf type {@code login}
	 */
	public static final class login extends
	com.google.protobuf.GeneratedMessage implements
	// @@protoc_insertion_point(message_implements:login)
	loginOrBuilder {
		// Use login.newBuilder() to construct.
		private login(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}
		private login(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

		private static final login defaultInstance;
		public static login getDefaultInstance() {
			return defaultInstance;
		}

		public login getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;
		@Override
		public final com.google.protobuf.UnknownFieldSet
		getUnknownFields() {
			return this.unknownFields;
		}
		private login(
				com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
						throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();
			int mutable_bitField0_ = 0;
			com.google.protobuf.UnknownFieldSet.Builder unknownFields =
					com.google.protobuf.UnknownFieldSet.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields,
								extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 10: {
						com.google.protobuf.ByteString bs = input.readBytes();
						bitField0_ |= 0x00000001;
						username_ = bs;
						break;
					}
					case 18: {
						com.google.protobuf.ByteString bs = input.readBytes();
						bitField0_ |= 0x00000002;
						password_ = bs;
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(
						e.getMessage()).setUnfinishedMessage(this);
			} finally {
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}
		public static final com.google.protobuf.Descriptors.Descriptor
		getDescriptor() {
			return Player.internal_static_login_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
		internalGetFieldAccessorTable() {
			return Player.internal_static_login_fieldAccessorTable
					.ensureFieldAccessorsInitialized(
							login.class, Builder.class);
		}

		public static com.google.protobuf.Parser<login> PARSER =
				new com.google.protobuf.AbstractParser<login>() {
					public login parsePartialFrom(
							com.google.protobuf.CodedInputStream input,
							com.google.protobuf.ExtensionRegistryLite extensionRegistry)
									throws com.google.protobuf.InvalidProtocolBufferException {
						return new login(input, extensionRegistry);
					}
				};

				@Override
				public com.google.protobuf.Parser<login> getParserForType() {
					return PARSER;
				}

				private int bitField0_;
				public static final int USERNAME_FIELD_NUMBER = 1;
				private Object username_;
				/**
				 * <code>required string username = 1;</code>
				 *
				 * <pre>
				 * 用户名（必需）
				 * </pre>
				 */
				public boolean hasUsername() {
					return ((bitField0_ & 0x00000001) == 0x00000001);
				}
				/**
				 * <code>required string username = 1;</code>
				 *
				 * <pre>
				 * 用户名（必需）
				 * </pre>
				 */
				public String getUsername() {
					Object ref = username_;
					if (ref instanceof String) {
						return (String) ref;
					} else {
						com.google.protobuf.ByteString bs = 
								(com.google.protobuf.ByteString) ref;
						String s = bs.toStringUtf8();
						if (bs.isValidUtf8()) {
							username_ = s;
						}
						return s;
					}
				}
				/**
				 * <code>required string username = 1;</code>
				 *
				 * <pre>
				 * 用户名（必需）
				 * </pre>
				 */
				public com.google.protobuf.ByteString
				getUsernameBytes() {
					Object ref = username_;
					if (ref instanceof String) {
						com.google.protobuf.ByteString b = 
								com.google.protobuf.ByteString.copyFromUtf8(
										(String) ref);
						username_ = b;
						return b;
					} else {
						return (com.google.protobuf.ByteString) ref;
					}
				}

				public static final int PASSWORD_FIELD_NUMBER = 2;
				private Object password_;
				/**
				 * <code>required string password = 2;</code>
				 *
				 * <pre>
				 * 密码（必需）
				 * </pre>
				 */
				public boolean hasPassword() {
					return ((bitField0_ & 0x00000002) == 0x00000002);
				}
				/**
				 * <code>required string password = 2;</code>
				 *
				 * <pre>
				 * 密码（必需）
				 * </pre>
				 */
				public String getPassword() {
					Object ref = password_;
					if (ref instanceof String) {
						return (String) ref;
					} else {
						com.google.protobuf.ByteString bs = 
								(com.google.protobuf.ByteString) ref;
						String s = bs.toStringUtf8();
						if (bs.isValidUtf8()) {
							password_ = s;
						}
						return s;
					}
				}
				/**
				 * <code>required string password = 2;</code>
				 *
				 * <pre>
				 * 密码（必需）
				 * </pre>
				 */
				public com.google.protobuf.ByteString
				getPasswordBytes() {
					Object ref = password_;
					if (ref instanceof String) {
						com.google.protobuf.ByteString b = 
								com.google.protobuf.ByteString.copyFromUtf8(
										(String) ref);
						password_ = b;
						return b;
					} else {
						return (com.google.protobuf.ByteString) ref;
					}
				}

				private void initFields() {
					username_ = "";
					password_ = "";
				}
				private byte memoizedIsInitialized = -1;
				public final boolean isInitialized() {
					byte isInitialized = memoizedIsInitialized;
					if (isInitialized == 1) return true;
					if (isInitialized == 0) return false;

					if (!hasUsername()) {
						memoizedIsInitialized = 0;
						return false;
					}
					if (!hasPassword()) {
						memoizedIsInitialized = 0;
						return false;
					}
					memoizedIsInitialized = 1;
					return true;
				}

				public void writeTo(com.google.protobuf.CodedOutputStream output)
						throws java.io.IOException {
					getSerializedSize();
					if (((bitField0_ & 0x00000001) == 0x00000001)) {
						output.writeBytes(1, getUsernameBytes());
					}
					if (((bitField0_ & 0x00000002) == 0x00000002)) {
						output.writeBytes(2, getPasswordBytes());
					}
					getUnknownFields().writeTo(output);
				}

				private int memoizedSerializedSize = -1;
				public int getSerializedSize() {
					int size = memoizedSerializedSize;
					if (size != -1) return size;

					size = 0;
					if (((bitField0_ & 0x00000001) == 0x00000001)) {
						size += com.google.protobuf.CodedOutputStream
								.computeBytesSize(1, getUsernameBytes());
					}
					if (((bitField0_ & 0x00000002) == 0x00000002)) {
						size += com.google.protobuf.CodedOutputStream
								.computeBytesSize(2, getPasswordBytes());
					}
					size += getUnknownFields().getSerializedSize();
					memoizedSerializedSize = size;
					return size;
				}

				private static final long serialVersionUID = 0L;
				@Override
				protected Object writeReplace()
						throws java.io.ObjectStreamException {
					return super.writeReplace();
				}

				public static login parseFrom(
						com.google.protobuf.ByteString data)
								throws com.google.protobuf.InvalidProtocolBufferException {
					return PARSER.parseFrom(data);
				}
				public static login parseFrom(
						com.google.protobuf.ByteString data,
						com.google.protobuf.ExtensionRegistryLite extensionRegistry)
								throws com.google.protobuf.InvalidProtocolBufferException {
					return PARSER.parseFrom(data, extensionRegistry);
				}
				public static login parseFrom(byte[] data)
						throws com.google.protobuf.InvalidProtocolBufferException {
					return PARSER.parseFrom(data);
				}
				public static login parseFrom(
						byte[] data,
						com.google.protobuf.ExtensionRegistryLite extensionRegistry)
								throws com.google.protobuf.InvalidProtocolBufferException {
					return PARSER.parseFrom(data, extensionRegistry);
				}
				public static login parseFrom(java.io.InputStream input)
						throws java.io.IOException {
					return PARSER.parseFrom(input);
				}
				public static login parseFrom(
						java.io.InputStream input,
						com.google.protobuf.ExtensionRegistryLite extensionRegistry)
								throws java.io.IOException {
					return PARSER.parseFrom(input, extensionRegistry);
				}
				public static login parseDelimitedFrom(java.io.InputStream input)
						throws java.io.IOException {
					return PARSER.parseDelimitedFrom(input);
				}
				public static login parseDelimitedFrom(
						java.io.InputStream input,
						com.google.protobuf.ExtensionRegistryLite extensionRegistry)
								throws java.io.IOException {
					return PARSER.parseDelimitedFrom(input, extensionRegistry);
				}
				public static login parseFrom(
						com.google.protobuf.CodedInputStream input)
								throws java.io.IOException {
					return PARSER.parseFrom(input);
				}
				public static login parseFrom(
						com.google.protobuf.CodedInputStream input,
						com.google.protobuf.ExtensionRegistryLite extensionRegistry)
								throws java.io.IOException {
					return PARSER.parseFrom(input, extensionRegistry);
				}

				public static Builder newBuilder() { return Builder.create(); }
				public Builder newBuilderForType() { return newBuilder(); }
				public static Builder newBuilder(login prototype) {
					return newBuilder().mergeFrom(prototype);
				}
				public Builder toBuilder() { return newBuilder(this); }

				@Override
				protected Builder newBuilderForType(
						com.google.protobuf.GeneratedMessage.BuilderParent parent) {
					Builder builder = new Builder(parent);
					return builder;
				}
				/**
				 * Protobuf type {@code login}
				 */
				public static final class Builder extends
				com.google.protobuf.GeneratedMessage.Builder<Builder> implements
				// @@protoc_insertion_point(builder_implements:login)
				loginOrBuilder {
					public static final com.google.protobuf.Descriptors.Descriptor
					getDescriptor() {
						return Player.internal_static_login_descriptor;
					}

					protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
					internalGetFieldAccessorTable() {
						return Player.internal_static_login_fieldAccessorTable
								.ensureFieldAccessorsInitialized(
										login.class, Builder.class);
					}

					// Construct using Player.login.newBuilder()
					private Builder() {
						maybeForceBuilderInitialization();
					}

					private Builder(
							com.google.protobuf.GeneratedMessage.BuilderParent parent) {
						super(parent);
						maybeForceBuilderInitialization();
					}
					private void maybeForceBuilderInitialization() {
						if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
						}
					}
					private static Builder create() {
						return new Builder();
					}

					public Builder clear() {
						super.clear();
						username_ = "";
						bitField0_ = (bitField0_ & ~0x00000001);
						password_ = "";
						bitField0_ = (bitField0_ & ~0x00000002);
						return this;
					}

					public Builder clone() {
						return create().mergeFrom(buildPartial());
					}

					public com.google.protobuf.Descriptors.Descriptor
					getDescriptorForType() {
						return Player.internal_static_login_descriptor;
					}

					public login getDefaultInstanceForType() {
						return login.getDefaultInstance();
					}

					public login build() {
						login result = buildPartial();
						if (!result.isInitialized()) {
							throw newUninitializedMessageException(result);
						}
						return result;
					}

					public login buildPartial() {
						login result = new login(this);
						int from_bitField0_ = bitField0_;
						int to_bitField0_ = 0;
						if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
							to_bitField0_ |= 0x00000001;
						}
						result.username_ = username_;
						if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
							to_bitField0_ |= 0x00000002;
						}
						result.password_ = password_;
						result.bitField0_ = to_bitField0_;
						onBuilt();
						return result;
					}

					public Builder mergeFrom(com.google.protobuf.Message other) {
						if (other instanceof login) {
							return mergeFrom((login)other);
						} else {
							super.mergeFrom(other);
							return this;
						}
					}

					public Builder mergeFrom(login other) {
						if (other == login.getDefaultInstance()) return this;
						if (other.hasUsername()) {
							bitField0_ |= 0x00000001;
							username_ = other.username_;
							onChanged();
						}
						if (other.hasPassword()) {
							bitField0_ |= 0x00000002;
							password_ = other.password_;
							onChanged();
						}
						this.mergeUnknownFields(other.getUnknownFields());
						return this;
					}

					public final boolean isInitialized() {
						if (!hasUsername()) {

							return false;
						}
						if (!hasPassword()) {

							return false;
						}
						return true;
					}

					public Builder mergeFrom(
							com.google.protobuf.CodedInputStream input,
							com.google.protobuf.ExtensionRegistryLite extensionRegistry)
									throws java.io.IOException {
						login parsedMessage = null;
						try {
							parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
						} catch (com.google.protobuf.InvalidProtocolBufferException e) {
							parsedMessage = (login) e.getUnfinishedMessage();
							throw e;
						} finally {
							if (parsedMessage != null) {
								mergeFrom(parsedMessage);
							}
						}
						return this;
					}
					private int bitField0_;

					private Object username_ = "";
					/**
					 * <code>required string username = 1;</code>
					 *
					 * <pre>
					 * 用户名（必需）
					 * </pre>
					 */
					public boolean hasUsername() {
						return ((bitField0_ & 0x00000001) == 0x00000001);
					}
					/**
					 * <code>required string username = 1;</code>
					 *
					 * <pre>
					 * 用户名（必需）
					 * </pre>
					 */
					public String getUsername() {
						Object ref = username_;
						if (!(ref instanceof String)) {
							com.google.protobuf.ByteString bs =
									(com.google.protobuf.ByteString) ref;
							String s = bs.toStringUtf8();
							if (bs.isValidUtf8()) {
								username_ = s;
							}
							return s;
						} else {
							return (String) ref;
						}
					}
					/**
					 * <code>required string username = 1;</code>
					 *
					 * <pre>
					 * 用户名（必需）
					 * </pre>
					 */
					public com.google.protobuf.ByteString
					getUsernameBytes() {
						Object ref = username_;
						if (ref instanceof String) {
							com.google.protobuf.ByteString b = 
									com.google.protobuf.ByteString.copyFromUtf8(
											(String) ref);
							username_ = b;
							return b;
						} else {
							return (com.google.protobuf.ByteString) ref;
						}
					}
					/**
					 * <code>required string username = 1;</code>
					 *
					 * <pre>
					 * 用户名（必需）
					 * </pre>
					 */
					public Builder setUsername(
							String value) {
						if (value == null) {
							throw new NullPointerException();
						}
						bitField0_ |= 0x00000001;
						username_ = value;
						onChanged();
						return this;
					}
					/**
					 * <code>required string username = 1;</code>
					 *
					 * <pre>
					 * 用户名（必需）
					 * </pre>
					 */
					public Builder clearUsername() {
						bitField0_ = (bitField0_ & ~0x00000001);
						username_ = getDefaultInstance().getUsername();
						onChanged();
						return this;
					}
					/**
					 * <code>required string username = 1;</code>
					 *
					 * <pre>
					 * 用户名（必需）
					 * </pre>
					 */
					public Builder setUsernameBytes(
							com.google.protobuf.ByteString value) {
						if (value == null) {
							throw new NullPointerException();
						}
						bitField0_ |= 0x00000001;
						username_ = value;
						onChanged();
						return this;
					}

					private Object password_ = "";
					/**
					 * <code>required string password = 2;</code>
					 *
					 * <pre>
					 * 密码（必需）
					 * </pre>
					 */
					public boolean hasPassword() {
						return ((bitField0_ & 0x00000002) == 0x00000002);
					}
					/**
					 * <code>required string password = 2;</code>
					 *
					 * <pre>
					 * 密码（必需）
					 * </pre>
					 */
					public String getPassword() {
						Object ref = password_;
						if (!(ref instanceof String)) {
							com.google.protobuf.ByteString bs =
									(com.google.protobuf.ByteString) ref;
							String s = bs.toStringUtf8();
							if (bs.isValidUtf8()) {
								password_ = s;
							}
							return s;
						} else {
							return (String) ref;
						}
					}
					/**
					 * <code>required string password = 2;</code>
					 *
					 * <pre>
					 * 密码（必需）
					 * </pre>
					 */
					public com.google.protobuf.ByteString
					getPasswordBytes() {
						Object ref = password_;
						if (ref instanceof String) {
							com.google.protobuf.ByteString b = 
									com.google.protobuf.ByteString.copyFromUtf8(
											(String) ref);
							password_ = b;
							return b;
						} else {
							return (com.google.protobuf.ByteString) ref;
						}
					}
					/**
					 * <code>required string password = 2;</code>
					 *
					 * <pre>
					 * 密码（必需）
					 * </pre>
					 */
					public Builder setPassword(
							String value) {
						if (value == null) {
							throw new NullPointerException();
						}
						bitField0_ |= 0x00000002;
						password_ = value;
						onChanged();
						return this;
					}
					/**
					 * <code>required string password = 2;</code>
					 *
					 * <pre>
					 * 密码（必需）
					 * </pre>
					 */
					public Builder clearPassword() {
						bitField0_ = (bitField0_ & ~0x00000002);
						password_ = getDefaultInstance().getPassword();
						onChanged();
						return this;
					}
					/**
					 * <code>required string password = 2;</code>
					 *
					 * <pre>
					 * 密码（必需）
					 * </pre>
					 */
					public Builder setPasswordBytes(
							com.google.protobuf.ByteString value) {
						if (value == null) {
							throw new NullPointerException();
						}
						bitField0_ |= 0x00000002;
						password_ = value;
						onChanged();
						return this;
					}

					// @@protoc_insertion_point(builder_scope:login)
				}

				static {
					defaultInstance = new login(true);
					defaultInstance.initFields();
				}

				// @@protoc_insertion_point(class_scope:login)
	}

	private static final com.google.protobuf.Descriptors.Descriptor
	internal_static_login_descriptor;
	private static
	com.google.protobuf.GeneratedMessage.FieldAccessorTable
	internal_static_login_fieldAccessorTable;

	public static com.google.protobuf.Descriptors.FileDescriptor
	getDescriptor() {
		return descriptor;
	}
	private static com.google.protobuf.Descriptors.FileDescriptor
	descriptor;
	static {
		String[] descriptorData = {
				"\n\014Player.proto\"+\n\005login\022\020\n\010username\030\001 \002(" +
						"\t\022\020\n\010password\030\002 \002(\t"
		};
		com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
				new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
			public com.google.protobuf.ExtensionRegistry assignDescriptors(
					com.google.protobuf.Descriptors.FileDescriptor root) {
				descriptor = root;
				return null;
			}
		};
		com.google.protobuf.Descriptors.FileDescriptor
		.internalBuildGeneratedFileFrom(descriptorData,
				new com.google.protobuf.Descriptors.FileDescriptor[] {
		}, assigner);
		internal_static_login_descriptor =
				getDescriptor().getMessageTypes().get(0);
		internal_static_login_fieldAccessorTable = new
				com.google.protobuf.GeneratedMessage.FieldAccessorTable(
						internal_static_login_descriptor,
						new String[] { "Username", "Password", });
	}

	// @@protoc_insertion_point(outer_class_scope)
}
