//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_properties.g.dart';

/// ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties
///
/// Properties:
/// * [ranking] 
/// * [enable] 
@BuiltValue()
abstract class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties implements Built<ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties, ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySPropertiesBuilder> {
  @BuiltValueField(wireName: r'ranking')
  ConfigNodePropertyInteger? get ranking;

  @BuiltValueField(wireName: r'enable')
  ConfigNodePropertyBoolean? get enable;

  ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties._();

  factory ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties([void updates(ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySPropertiesBuilder b)]) = _$ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties> get serializer => _$ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySPropertiesSerializer();
}

class _$ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties, _$ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties];

  @override
  final String wireName = r'ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.ranking != null) {
      yield r'ranking';
      yield serializers.serialize(
        object.ranking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.enable != null) {
      yield r'enable';
      yield serializers.serialize(
        object.enable,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.ranking.replace(valueDes);
          break;
        case r'enable':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enable.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySPropertiesBuilder();
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

