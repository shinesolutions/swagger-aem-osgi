//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties.g.dart';

/// ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties
///
/// Properties:
/// * [linkPeriodExpiredPeriodPrefix] 
/// * [linkPeriodExpiredPeriodRemove] 
/// * [linkPeriodExpiredPeriodSuffix] 
/// * [linkPeriodInvalidPeriodPrefix] 
/// * [linkPeriodInvalidPeriodRemove] 
/// * [linkPeriodInvalidPeriodSuffix] 
/// * [linkPeriodPredatedPeriodPrefix] 
/// * [linkPeriodPredatedPeriodRemove] 
/// * [linkPeriodPredatedPeriodSuffix] 
/// * [linkPeriodWcmmodes] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties implements Built<ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties, ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'link.expired.prefix')
  ConfigNodePropertyString? get linkPeriodExpiredPeriodPrefix;

  @BuiltValueField(wireName: r'link.expired.remove')
  ConfigNodePropertyBoolean? get linkPeriodExpiredPeriodRemove;

  @BuiltValueField(wireName: r'link.expired.suffix')
  ConfigNodePropertyString? get linkPeriodExpiredPeriodSuffix;

  @BuiltValueField(wireName: r'link.invalid.prefix')
  ConfigNodePropertyString? get linkPeriodInvalidPeriodPrefix;

  @BuiltValueField(wireName: r'link.invalid.remove')
  ConfigNodePropertyBoolean? get linkPeriodInvalidPeriodRemove;

  @BuiltValueField(wireName: r'link.invalid.suffix')
  ConfigNodePropertyString? get linkPeriodInvalidPeriodSuffix;

  @BuiltValueField(wireName: r'link.predated.prefix')
  ConfigNodePropertyString? get linkPeriodPredatedPeriodPrefix;

  @BuiltValueField(wireName: r'link.predated.remove')
  ConfigNodePropertyBoolean? get linkPeriodPredatedPeriodRemove;

  @BuiltValueField(wireName: r'link.predated.suffix')
  ConfigNodePropertyString? get linkPeriodPredatedPeriodSuffix;

  @BuiltValueField(wireName: r'link.wcmmodes')
  ConfigNodePropertyArray? get linkPeriodWcmmodes;

  ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties._();

  factory ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties([void updates(ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties> get serializer => _$ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties, _$ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.linkPeriodExpiredPeriodPrefix != null) {
      yield r'link.expired.prefix';
      yield serializers.serialize(
        object.linkPeriodExpiredPeriodPrefix,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.linkPeriodExpiredPeriodRemove != null) {
      yield r'link.expired.remove';
      yield serializers.serialize(
        object.linkPeriodExpiredPeriodRemove,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.linkPeriodExpiredPeriodSuffix != null) {
      yield r'link.expired.suffix';
      yield serializers.serialize(
        object.linkPeriodExpiredPeriodSuffix,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.linkPeriodInvalidPeriodPrefix != null) {
      yield r'link.invalid.prefix';
      yield serializers.serialize(
        object.linkPeriodInvalidPeriodPrefix,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.linkPeriodInvalidPeriodRemove != null) {
      yield r'link.invalid.remove';
      yield serializers.serialize(
        object.linkPeriodInvalidPeriodRemove,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.linkPeriodInvalidPeriodSuffix != null) {
      yield r'link.invalid.suffix';
      yield serializers.serialize(
        object.linkPeriodInvalidPeriodSuffix,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.linkPeriodPredatedPeriodPrefix != null) {
      yield r'link.predated.prefix';
      yield serializers.serialize(
        object.linkPeriodPredatedPeriodPrefix,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.linkPeriodPredatedPeriodRemove != null) {
      yield r'link.predated.remove';
      yield serializers.serialize(
        object.linkPeriodPredatedPeriodRemove,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.linkPeriodPredatedPeriodSuffix != null) {
      yield r'link.predated.suffix';
      yield serializers.serialize(
        object.linkPeriodPredatedPeriodSuffix,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.linkPeriodWcmmodes != null) {
      yield r'link.wcmmodes';
      yield serializers.serialize(
        object.linkPeriodWcmmodes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'link.expired.prefix':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.linkPeriodExpiredPeriodPrefix.replace(valueDes);
          break;
        case r'link.expired.remove':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.linkPeriodExpiredPeriodRemove.replace(valueDes);
          break;
        case r'link.expired.suffix':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.linkPeriodExpiredPeriodSuffix.replace(valueDes);
          break;
        case r'link.invalid.prefix':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.linkPeriodInvalidPeriodPrefix.replace(valueDes);
          break;
        case r'link.invalid.remove':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.linkPeriodInvalidPeriodRemove.replace(valueDes);
          break;
        case r'link.invalid.suffix':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.linkPeriodInvalidPeriodSuffix.replace(valueDes);
          break;
        case r'link.predated.prefix':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.linkPeriodPredatedPeriodPrefix.replace(valueDes);
          break;
        case r'link.predated.remove':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.linkPeriodPredatedPeriodRemove.replace(valueDes);
          break;
        case r'link.predated.suffix':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.linkPeriodPredatedPeriodSuffix.replace(valueDes);
          break;
        case r'link.wcmmodes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.linkPeriodWcmmodes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesBuilder();
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

