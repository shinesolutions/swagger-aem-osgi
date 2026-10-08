//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_translation_impl_ugc_language_detector_properties.g.dart';

/// ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties
///
/// Properties:
/// * [eventPeriodTopics] 
/// * [eventPeriodFilter] 
/// * [translatePeriodListenerPeriodType] 
/// * [translatePeriodPropertyPeriodList] 
/// * [poolSize] 
/// * [maxPoolSize] 
/// * [queueSize] 
/// * [keepAliveTime] 
@BuiltValue()
abstract class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties implements Built<ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties, ComAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesBuilder> {
  @BuiltValueField(wireName: r'event.topics')
  ConfigNodePropertyString? get eventPeriodTopics;

  @BuiltValueField(wireName: r'event.filter')
  ConfigNodePropertyString? get eventPeriodFilter;

  @BuiltValueField(wireName: r'translate.listener.type')
  ConfigNodePropertyArray? get translatePeriodListenerPeriodType;

  @BuiltValueField(wireName: r'translate.property.list')
  ConfigNodePropertyArray? get translatePeriodPropertyPeriodList;

  @BuiltValueField(wireName: r'poolSize')
  ConfigNodePropertyInteger? get poolSize;

  @BuiltValueField(wireName: r'maxPoolSize')
  ConfigNodePropertyInteger? get maxPoolSize;

  @BuiltValueField(wireName: r'queueSize')
  ConfigNodePropertyInteger? get queueSize;

  @BuiltValueField(wireName: r'keepAliveTime')
  ConfigNodePropertyInteger? get keepAliveTime;

  ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties._();

  factory ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties([void updates(ComAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesBuilder b)]) = _$ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties> get serializer => _$ComAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesSerializer();
}

class _$ComAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties, _$ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties];

  @override
  final String wireName = r'ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties object, {
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
    if (object.translatePeriodListenerPeriodType != null) {
      yield r'translate.listener.type';
      yield serializers.serialize(
        object.translatePeriodListenerPeriodType,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.translatePeriodPropertyPeriodList != null) {
      yield r'translate.property.list';
      yield serializers.serialize(
        object.translatePeriodPropertyPeriodList,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.poolSize != null) {
      yield r'poolSize';
      yield serializers.serialize(
        object.poolSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.maxPoolSize != null) {
      yield r'maxPoolSize';
      yield serializers.serialize(
        object.maxPoolSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.queueSize != null) {
      yield r'queueSize';
      yield serializers.serialize(
        object.queueSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.keepAliveTime != null) {
      yield r'keepAliveTime';
      yield serializers.serialize(
        object.keepAliveTime,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesBuilder result,
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
        case r'translate.listener.type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.translatePeriodListenerPeriodType.replace(valueDes);
          break;
        case r'translate.property.list':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.translatePeriodPropertyPeriodList.replace(valueDes);
          break;
        case r'poolSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.poolSize.replace(valueDes);
          break;
        case r'maxPoolSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxPoolSize.replace(valueDes);
          break;
        case r'queueSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.queueSize.replace(valueDes);
          break;
        case r'keepAliveTime':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.keepAliveTime.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesBuilder();
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

