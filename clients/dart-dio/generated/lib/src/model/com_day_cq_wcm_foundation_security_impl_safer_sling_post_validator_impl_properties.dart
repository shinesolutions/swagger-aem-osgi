//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties.g.dart';

/// ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties
///
/// Properties:
/// * [parameterPeriodWhitelist] 
/// * [parameterPeriodWhitelistPeriodPrefixes] 
/// * [binaryPeriodParameterPeriodWhitelist] 
/// * [modifierPeriodWhitelist] 
/// * [operationPeriodWhitelist] 
/// * [operationPeriodWhitelistPeriodPrefixes] 
/// * [typehintPeriodWhitelist] 
/// * [resourcetypePeriodWhitelist] 
@BuiltValue()
abstract class ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties implements Built<ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties, ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'parameter.whitelist')
  ConfigNodePropertyArray? get parameterPeriodWhitelist;

  @BuiltValueField(wireName: r'parameter.whitelist.prefixes')
  ConfigNodePropertyArray? get parameterPeriodWhitelistPeriodPrefixes;

  @BuiltValueField(wireName: r'binary.parameter.whitelist')
  ConfigNodePropertyArray? get binaryPeriodParameterPeriodWhitelist;

  @BuiltValueField(wireName: r'modifier.whitelist')
  ConfigNodePropertyArray? get modifierPeriodWhitelist;

  @BuiltValueField(wireName: r'operation.whitelist')
  ConfigNodePropertyArray? get operationPeriodWhitelist;

  @BuiltValueField(wireName: r'operation.whitelist.prefixes')
  ConfigNodePropertyArray? get operationPeriodWhitelistPeriodPrefixes;

  @BuiltValueField(wireName: r'typehint.whitelist')
  ConfigNodePropertyArray? get typehintPeriodWhitelist;

  @BuiltValueField(wireName: r'resourcetype.whitelist')
  ConfigNodePropertyArray? get resourcetypePeriodWhitelist;

  ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties._();

  factory ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties([void updates(ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesBuilder b)]) = _$ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties> get serializer => _$ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesSerializer();
}

class _$ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties, _$ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties];

  @override
  final String wireName = r'ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.parameterPeriodWhitelist != null) {
      yield r'parameter.whitelist';
      yield serializers.serialize(
        object.parameterPeriodWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.parameterPeriodWhitelistPeriodPrefixes != null) {
      yield r'parameter.whitelist.prefixes';
      yield serializers.serialize(
        object.parameterPeriodWhitelistPeriodPrefixes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.binaryPeriodParameterPeriodWhitelist != null) {
      yield r'binary.parameter.whitelist';
      yield serializers.serialize(
        object.binaryPeriodParameterPeriodWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.modifierPeriodWhitelist != null) {
      yield r'modifier.whitelist';
      yield serializers.serialize(
        object.modifierPeriodWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.operationPeriodWhitelist != null) {
      yield r'operation.whitelist';
      yield serializers.serialize(
        object.operationPeriodWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.operationPeriodWhitelistPeriodPrefixes != null) {
      yield r'operation.whitelist.prefixes';
      yield serializers.serialize(
        object.operationPeriodWhitelistPeriodPrefixes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.typehintPeriodWhitelist != null) {
      yield r'typehint.whitelist';
      yield serializers.serialize(
        object.typehintPeriodWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.resourcetypePeriodWhitelist != null) {
      yield r'resourcetype.whitelist';
      yield serializers.serialize(
        object.resourcetypePeriodWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'parameter.whitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.parameterPeriodWhitelist.replace(valueDes);
          break;
        case r'parameter.whitelist.prefixes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.parameterPeriodWhitelistPeriodPrefixes.replace(valueDes);
          break;
        case r'binary.parameter.whitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.binaryPeriodParameterPeriodWhitelist.replace(valueDes);
          break;
        case r'modifier.whitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.modifierPeriodWhitelist.replace(valueDes);
          break;
        case r'operation.whitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.operationPeriodWhitelist.replace(valueDes);
          break;
        case r'operation.whitelist.prefixes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.operationPeriodWhitelistPeriodPrefixes.replace(valueDes);
          break;
        case r'typehint.whitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.typehintPeriodWhitelist.replace(valueDes);
          break;
        case r'resourcetype.whitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.resourcetypePeriodWhitelist.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesBuilder();
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

