//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_properties.g.dart';

/// ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties
///
/// Properties:
/// * [accepted] 
/// * [ranked] 
@BuiltValue()
abstract class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties implements Built<ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties, ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenPropertiesBuilder> {
  @BuiltValueField(wireName: r'accepted')
  ConfigNodePropertyBoolean? get accepted;

  @BuiltValueField(wireName: r'ranked')
  ConfigNodePropertyInteger? get ranked;

  ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties._();

  factory ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties([void updates(ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenPropertiesBuilder b)]) = _$ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties> get serializer => _$ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenPropertiesSerializer();
}

class _$ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties, _$ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties];

  @override
  final String wireName = r'ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.accepted != null) {
      yield r'accepted';
      yield serializers.serialize(
        object.accepted,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.ranked != null) {
      yield r'ranked';
      yield serializers.serialize(
        object.ranked,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'accepted':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.accepted.replace(valueDes);
          break;
        case r'ranked':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.ranked.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenPropertiesBuilder();
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

