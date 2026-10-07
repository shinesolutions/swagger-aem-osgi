//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_translation_impl_translation_service_config_manager_properties.g.dart';

/// ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties
///
/// Properties:
/// * [translatePeriodLanguage] 
/// * [translatePeriodDisplay] 
/// * [translatePeriodAttribution] 
/// * [translatePeriodCaching] 
/// * [translatePeriodSmartPeriodRendering] 
/// * [translatePeriodCachingPeriodDuration] 
/// * [translatePeriodSessionPeriodSavePeriodInterval] 
/// * [translatePeriodSessionPeriodSavePeriodBatchLimit] 
@BuiltValue()
abstract class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties implements Built<ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties, ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesBuilder> {
  @BuiltValueField(wireName: r'translate.language')
  ConfigNodePropertyDropDown? get translatePeriodLanguage;

  @BuiltValueField(wireName: r'translate.display')
  ConfigNodePropertyDropDown? get translatePeriodDisplay;

  @BuiltValueField(wireName: r'translate.attribution')
  ConfigNodePropertyBoolean? get translatePeriodAttribution;

  @BuiltValueField(wireName: r'translate.caching')
  ConfigNodePropertyDropDown? get translatePeriodCaching;

  @BuiltValueField(wireName: r'translate.smart.rendering')
  ConfigNodePropertyDropDown? get translatePeriodSmartPeriodRendering;

  @BuiltValueField(wireName: r'translate.caching.duration')
  ConfigNodePropertyString? get translatePeriodCachingPeriodDuration;

  @BuiltValueField(wireName: r'translate.session.save.interval')
  ConfigNodePropertyString? get translatePeriodSessionPeriodSavePeriodInterval;

  @BuiltValueField(wireName: r'translate.session.save.batchLimit')
  ConfigNodePropertyString? get translatePeriodSessionPeriodSavePeriodBatchLimit;

  ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties._();

  factory ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties([void updates(ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesBuilder b)]) = _$ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties> get serializer => _$ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesSerializer();
}

class _$ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties, _$ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties];

  @override
  final String wireName = r'ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.translatePeriodLanguage != null) {
      yield r'translate.language';
      yield serializers.serialize(
        object.translatePeriodLanguage,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.translatePeriodDisplay != null) {
      yield r'translate.display';
      yield serializers.serialize(
        object.translatePeriodDisplay,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.translatePeriodAttribution != null) {
      yield r'translate.attribution';
      yield serializers.serialize(
        object.translatePeriodAttribution,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.translatePeriodCaching != null) {
      yield r'translate.caching';
      yield serializers.serialize(
        object.translatePeriodCaching,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.translatePeriodSmartPeriodRendering != null) {
      yield r'translate.smart.rendering';
      yield serializers.serialize(
        object.translatePeriodSmartPeriodRendering,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.translatePeriodCachingPeriodDuration != null) {
      yield r'translate.caching.duration';
      yield serializers.serialize(
        object.translatePeriodCachingPeriodDuration,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.translatePeriodSessionPeriodSavePeriodInterval != null) {
      yield r'translate.session.save.interval';
      yield serializers.serialize(
        object.translatePeriodSessionPeriodSavePeriodInterval,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.translatePeriodSessionPeriodSavePeriodBatchLimit != null) {
      yield r'translate.session.save.batchLimit';
      yield serializers.serialize(
        object.translatePeriodSessionPeriodSavePeriodBatchLimit,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'translate.language':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.translatePeriodLanguage.replace(valueDes);
          break;
        case r'translate.display':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.translatePeriodDisplay.replace(valueDes);
          break;
        case r'translate.attribution':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.translatePeriodAttribution.replace(valueDes);
          break;
        case r'translate.caching':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.translatePeriodCaching.replace(valueDes);
          break;
        case r'translate.smart.rendering':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.translatePeriodSmartPeriodRendering.replace(valueDes);
          break;
        case r'translate.caching.duration':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.translatePeriodCachingPeriodDuration.replace(valueDes);
          break;
        case r'translate.session.save.interval':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.translatePeriodSessionPeriodSavePeriodInterval.replace(valueDes);
          break;
        case r'translate.session.save.batchLimit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.translatePeriodSessionPeriodSavePeriodBatchLimit.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesBuilder();
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

