//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_scoring_impl_scoring_event_listener_properties.g.dart';

/// ComAdobeCqSocialScoringImplScoringEventListenerProperties
///
/// Properties:
/// * [eventPeriodTopics] 
/// * [eventPeriodFilter] 
@BuiltValue()
abstract class ComAdobeCqSocialScoringImplScoringEventListenerProperties implements Built<ComAdobeCqSocialScoringImplScoringEventListenerProperties, ComAdobeCqSocialScoringImplScoringEventListenerPropertiesBuilder> {
  @BuiltValueField(wireName: r'event.topics')
  ConfigNodePropertyString? get eventPeriodTopics;

  @BuiltValueField(wireName: r'event.filter')
  ConfigNodePropertyString? get eventPeriodFilter;

  ComAdobeCqSocialScoringImplScoringEventListenerProperties._();

  factory ComAdobeCqSocialScoringImplScoringEventListenerProperties([void updates(ComAdobeCqSocialScoringImplScoringEventListenerPropertiesBuilder b)]) = _$ComAdobeCqSocialScoringImplScoringEventListenerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialScoringImplScoringEventListenerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialScoringImplScoringEventListenerProperties> get serializer => _$ComAdobeCqSocialScoringImplScoringEventListenerPropertiesSerializer();
}

class _$ComAdobeCqSocialScoringImplScoringEventListenerPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialScoringImplScoringEventListenerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialScoringImplScoringEventListenerProperties, _$ComAdobeCqSocialScoringImplScoringEventListenerProperties];

  @override
  final String wireName = r'ComAdobeCqSocialScoringImplScoringEventListenerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialScoringImplScoringEventListenerProperties object, {
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
    ComAdobeCqSocialScoringImplScoringEventListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialScoringImplScoringEventListenerPropertiesBuilder result,
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
  ComAdobeCqSocialScoringImplScoringEventListenerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialScoringImplScoringEventListenerPropertiesBuilder();
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

