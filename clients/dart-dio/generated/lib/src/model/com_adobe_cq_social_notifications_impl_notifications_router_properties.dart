//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_notifications_impl_notifications_router_properties.g.dart';

/// ComAdobeCqSocialNotificationsImplNotificationsRouterProperties
///
/// Properties:
/// * [eventPeriodTopics] 
/// * [eventPeriodFilter] 
@BuiltValue()
abstract class ComAdobeCqSocialNotificationsImplNotificationsRouterProperties implements Built<ComAdobeCqSocialNotificationsImplNotificationsRouterProperties, ComAdobeCqSocialNotificationsImplNotificationsRouterPropertiesBuilder> {
  @BuiltValueField(wireName: r'event.topics')
  ConfigNodePropertyString? get eventPeriodTopics;

  @BuiltValueField(wireName: r'event.filter')
  ConfigNodePropertyString? get eventPeriodFilter;

  ComAdobeCqSocialNotificationsImplNotificationsRouterProperties._();

  factory ComAdobeCqSocialNotificationsImplNotificationsRouterProperties([void updates(ComAdobeCqSocialNotificationsImplNotificationsRouterPropertiesBuilder b)]) = _$ComAdobeCqSocialNotificationsImplNotificationsRouterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialNotificationsImplNotificationsRouterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialNotificationsImplNotificationsRouterProperties> get serializer => _$ComAdobeCqSocialNotificationsImplNotificationsRouterPropertiesSerializer();
}

class _$ComAdobeCqSocialNotificationsImplNotificationsRouterPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialNotificationsImplNotificationsRouterProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialNotificationsImplNotificationsRouterProperties, _$ComAdobeCqSocialNotificationsImplNotificationsRouterProperties];

  @override
  final String wireName = r'ComAdobeCqSocialNotificationsImplNotificationsRouterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialNotificationsImplNotificationsRouterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.eventPeriodTopics != null) {
      yield r'event.topics';
      yield serializers.serialize(
        object.eventPeriodTopics,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.eventPeriodFilter != null) {
      yield r'event.filter';
      yield serializers.serialize(
        object.eventPeriodFilter,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialNotificationsImplNotificationsRouterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialNotificationsImplNotificationsRouterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event.topics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.eventPeriodTopics.replace(valueDes);
          break;
        case r'event.filter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.eventPeriodFilter.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialNotificationsImplNotificationsRouterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialNotificationsImplNotificationsRouterPropertiesBuilder();
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

