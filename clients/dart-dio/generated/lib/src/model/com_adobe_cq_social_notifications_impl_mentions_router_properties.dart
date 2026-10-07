//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_notifications_impl_mentions_router_properties.g.dart';

/// ComAdobeCqSocialNotificationsImplMentionsRouterProperties
///
/// Properties:
/// * [eventPeriodTopics] 
/// * [eventPeriodFilter] 
@BuiltValue()
abstract class ComAdobeCqSocialNotificationsImplMentionsRouterProperties implements Built<ComAdobeCqSocialNotificationsImplMentionsRouterProperties, ComAdobeCqSocialNotificationsImplMentionsRouterPropertiesBuilder> {
  @BuiltValueField(wireName: r'event.topics')
  ConfigNodePropertyString? get eventPeriodTopics;

  @BuiltValueField(wireName: r'event.filter')
  ConfigNodePropertyString? get eventPeriodFilter;

  ComAdobeCqSocialNotificationsImplMentionsRouterProperties._();

  factory ComAdobeCqSocialNotificationsImplMentionsRouterProperties([void updates(ComAdobeCqSocialNotificationsImplMentionsRouterPropertiesBuilder b)]) = _$ComAdobeCqSocialNotificationsImplMentionsRouterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialNotificationsImplMentionsRouterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialNotificationsImplMentionsRouterProperties> get serializer => _$ComAdobeCqSocialNotificationsImplMentionsRouterPropertiesSerializer();
}

class _$ComAdobeCqSocialNotificationsImplMentionsRouterPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialNotificationsImplMentionsRouterProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialNotificationsImplMentionsRouterProperties, _$ComAdobeCqSocialNotificationsImplMentionsRouterProperties];

  @override
  final String wireName = r'ComAdobeCqSocialNotificationsImplMentionsRouterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialNotificationsImplMentionsRouterProperties object, {
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
    ComAdobeCqSocialNotificationsImplMentionsRouterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialNotificationsImplMentionsRouterPropertiesBuilder result,
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
  ComAdobeCqSocialNotificationsImplMentionsRouterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialNotificationsImplMentionsRouterPropertiesBuilder();
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

