//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties.g.dart';

/// ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties
///
/// Properties:
/// * [syncTranslationStatePeriodSchedulingFormat] 
/// * [schedulingRepeatTranslationPeriodSchedulingFormat] 
/// * [syncTranslationStatePeriodLockTimeoutInMinutes] 
/// * [exportPeriodFormat] 
@BuiltValue()
abstract class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties implements Built<ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties, ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'syncTranslationState.schedulingFormat')
  ConfigNodePropertyString? get syncTranslationStatePeriodSchedulingFormat;

  @BuiltValueField(wireName: r'schedulingRepeatTranslation.schedulingFormat')
  ConfigNodePropertyString? get schedulingRepeatTranslationPeriodSchedulingFormat;

  @BuiltValueField(wireName: r'syncTranslationState.lockTimeoutInMinutes')
  ConfigNodePropertyString? get syncTranslationStatePeriodLockTimeoutInMinutes;

  @BuiltValueField(wireName: r'export.format')
  ConfigNodePropertyDropDown? get exportPeriodFormat;

  ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties._();

  factory ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties([void updates(ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesBuilder b)]) = _$ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties> get serializer => _$ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesSerializer();
}

class _$ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties, _$ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties];

  @override
  final String wireName = r'ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.syncTranslationStatePeriodSchedulingFormat != null) {
      yield r'syncTranslationState.schedulingFormat';
      yield serializers.serialize(
        object.syncTranslationStatePeriodSchedulingFormat,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.schedulingRepeatTranslationPeriodSchedulingFormat != null) {
      yield r'schedulingRepeatTranslation.schedulingFormat';
      yield serializers.serialize(
        object.schedulingRepeatTranslationPeriodSchedulingFormat,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.syncTranslationStatePeriodLockTimeoutInMinutes != null) {
      yield r'syncTranslationState.lockTimeoutInMinutes';
      yield serializers.serialize(
        object.syncTranslationStatePeriodLockTimeoutInMinutes,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.exportPeriodFormat != null) {
      yield r'export.format';
      yield serializers.serialize(
        object.exportPeriodFormat,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'syncTranslationState.schedulingFormat':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.syncTranslationStatePeriodSchedulingFormat.replace(valueDes);
          break;
        case r'schedulingRepeatTranslation.schedulingFormat':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.schedulingRepeatTranslationPeriodSchedulingFormat.replace(valueDes);
          break;
        case r'syncTranslationState.lockTimeoutInMinutes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.syncTranslationStatePeriodLockTimeoutInMinutes.replace(valueDes);
          break;
        case r'export.format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.exportPeriodFormat.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesBuilder();
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

