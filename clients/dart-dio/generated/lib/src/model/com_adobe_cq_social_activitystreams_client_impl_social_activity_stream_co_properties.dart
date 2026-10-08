//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_properties.g.dart';

/// ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties
///
/// Properties:
/// * [priority] 
@BuiltValue()
abstract class ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties implements Built<ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties, ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoPropertiesBuilder> {
  @BuiltValueField(wireName: r'priority')
  ConfigNodePropertyInteger? get priority;

  ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties._();

  factory ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties([void updates(ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoPropertiesBuilder b)]) = _$ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties> get serializer => _$ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoPropertiesSerializer();
}

class _$ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties, _$ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties];

  @override
  final String wireName = r'ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.priority != null) {
      yield r'priority';
      yield serializers.serialize(
        object.priority,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'priority':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.priority.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoPropertiesBuilder();
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

