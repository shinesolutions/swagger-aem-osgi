//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_auth_impl_cug_cug_support_impl_properties.g.dart';

/// ComDayCqAuthImplCugCugSupportImplProperties
///
/// Properties:
/// * [cugPeriodExemptedPeriodPrincipals] 
/// * [cugPeriodEnabled] 
/// * [cugPeriodPrincipalsPeriodRegex] 
/// * [cugPeriodPrincipalsPeriodReplacement] 
@BuiltValue()
abstract class ComDayCqAuthImplCugCugSupportImplProperties implements Built<ComDayCqAuthImplCugCugSupportImplProperties, ComDayCqAuthImplCugCugSupportImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'cug.exempted.principals')
  ConfigNodePropertyArray? get cugPeriodExemptedPeriodPrincipals;

  @BuiltValueField(wireName: r'cug.enabled')
  ConfigNodePropertyBoolean? get cugPeriodEnabled;

  @BuiltValueField(wireName: r'cug.principals.regex')
  ConfigNodePropertyString? get cugPeriodPrincipalsPeriodRegex;

  @BuiltValueField(wireName: r'cug.principals.replacement')
  ConfigNodePropertyString? get cugPeriodPrincipalsPeriodReplacement;

  ComDayCqAuthImplCugCugSupportImplProperties._();

  factory ComDayCqAuthImplCugCugSupportImplProperties([void updates(ComDayCqAuthImplCugCugSupportImplPropertiesBuilder b)]) = _$ComDayCqAuthImplCugCugSupportImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqAuthImplCugCugSupportImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqAuthImplCugCugSupportImplProperties> get serializer => _$ComDayCqAuthImplCugCugSupportImplPropertiesSerializer();
}

class _$ComDayCqAuthImplCugCugSupportImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqAuthImplCugCugSupportImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqAuthImplCugCugSupportImplProperties, _$ComDayCqAuthImplCugCugSupportImplProperties];

  @override
  final String wireName = r'ComDayCqAuthImplCugCugSupportImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqAuthImplCugCugSupportImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cugPeriodExemptedPeriodPrincipals != null) {
      yield r'cug.exempted.principals';
      yield serializers.serialize(
        object.cugPeriodExemptedPeriodPrincipals,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cugPeriodEnabled != null) {
      yield r'cug.enabled';
      yield serializers.serialize(
        object.cugPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.cugPeriodPrincipalsPeriodRegex != null) {
      yield r'cug.principals.regex';
      yield serializers.serialize(
        object.cugPeriodPrincipalsPeriodRegex,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.cugPeriodPrincipalsPeriodReplacement != null) {
      yield r'cug.principals.replacement';
      yield serializers.serialize(
        object.cugPeriodPrincipalsPeriodReplacement,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqAuthImplCugCugSupportImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqAuthImplCugCugSupportImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cug.exempted.principals':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cugPeriodExemptedPeriodPrincipals.replace(valueDes);
          break;
        case r'cug.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cugPeriodEnabled.replace(valueDes);
          break;
        case r'cug.principals.regex':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cugPeriodPrincipalsPeriodRegex.replace(valueDes);
          break;
        case r'cug.principals.replacement':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cugPeriodPrincipalsPeriodReplacement.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqAuthImplCugCugSupportImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqAuthImplCugCugSupportImplPropertiesBuilder();
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

