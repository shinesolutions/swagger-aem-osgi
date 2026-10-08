//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler_properties.g.dart';

/// ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties
///
/// Properties:
/// * [eventPeriodTopics] 
/// * [eventPeriodFilter] 
@BuiltValue()
abstract class ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties implements Built<ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties, ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'event.topics')
  ConfigNodePropertyString? get eventPeriodTopics;

  @BuiltValueField(wireName: r'event.filter')
  ConfigNodePropertyString? get eventPeriodFilter;

  ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties._();

  factory ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties([void updates(ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerPropertiesBuilder b)]) = _$ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties> get serializer => _$ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerPropertiesSerializer();
}

class _$ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties, _$ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties];

  @override
  final String wireName = r'ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties object, {
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
    ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerPropertiesBuilder result,
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
  ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerPropertiesBuilder();
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

