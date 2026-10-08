//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/com_adobe_cq_social_user_impl_transport_http_to_publisher_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_user_impl_transport_http_to_publisher_info.g.dart';

/// ComAdobeCqSocialUserImplTransportHttpToPublisherInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class ComAdobeCqSocialUserImplTransportHttpToPublisherInfo implements Built<ComAdobeCqSocialUserImplTransportHttpToPublisherInfo, ComAdobeCqSocialUserImplTransportHttpToPublisherInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  ComAdobeCqSocialUserImplTransportHttpToPublisherProperties? get properties;

  ComAdobeCqSocialUserImplTransportHttpToPublisherInfo._();

  factory ComAdobeCqSocialUserImplTransportHttpToPublisherInfo([void updates(ComAdobeCqSocialUserImplTransportHttpToPublisherInfoBuilder b)]) = _$ComAdobeCqSocialUserImplTransportHttpToPublisherInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialUserImplTransportHttpToPublisherInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialUserImplTransportHttpToPublisherInfo> get serializer => _$ComAdobeCqSocialUserImplTransportHttpToPublisherInfoSerializer();
}

class _$ComAdobeCqSocialUserImplTransportHttpToPublisherInfoSerializer implements PrimitiveSerializer<ComAdobeCqSocialUserImplTransportHttpToPublisherInfo> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialUserImplTransportHttpToPublisherInfo, _$ComAdobeCqSocialUserImplTransportHttpToPublisherInfo];

  @override
  final String wireName = r'ComAdobeCqSocialUserImplTransportHttpToPublisherInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialUserImplTransportHttpToPublisherInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pid != null) {
      yield r'pid';
      yield serializers.serialize(
        object.pid,
        specifiedType: const FullType(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.properties != null) {
      yield r'properties';
      yield serializers.serialize(
        object.properties,
        specifiedType: const FullType(ComAdobeCqSocialUserImplTransportHttpToPublisherProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialUserImplTransportHttpToPublisherInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialUserImplTransportHttpToPublisherInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pid = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.title = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ComAdobeCqSocialUserImplTransportHttpToPublisherProperties),
          ) as ComAdobeCqSocialUserImplTransportHttpToPublisherProperties?;
          if (valueDes == null) continue;
          result.properties.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialUserImplTransportHttpToPublisherInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialUserImplTransportHttpToPublisherInfoBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

