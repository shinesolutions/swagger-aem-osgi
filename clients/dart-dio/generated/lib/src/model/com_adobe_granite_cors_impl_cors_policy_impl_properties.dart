//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_cors_impl_cors_policy_impl_properties.g.dart';

/// ComAdobeGraniteCorsImplCORSPolicyImplProperties
///
/// Properties:
/// * [alloworigin] 
/// * [alloworiginregexp] 
/// * [allowedpaths] 
/// * [exposedheaders] 
/// * [maxage] 
/// * [supportedheaders] 
/// * [supportedmethods] 
/// * [supportscredentials] 
@BuiltValue()
abstract class ComAdobeGraniteCorsImplCORSPolicyImplProperties implements Built<ComAdobeGraniteCorsImplCORSPolicyImplProperties, ComAdobeGraniteCorsImplCORSPolicyImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'alloworigin')
  ConfigNodePropertyArray? get alloworigin;

  @BuiltValueField(wireName: r'alloworiginregexp')
  ConfigNodePropertyArray? get alloworiginregexp;

  @BuiltValueField(wireName: r'allowedpaths')
  ConfigNodePropertyArray? get allowedpaths;

  @BuiltValueField(wireName: r'exposedheaders')
  ConfigNodePropertyArray? get exposedheaders;

  @BuiltValueField(wireName: r'maxage')
  ConfigNodePropertyInteger? get maxage;

  @BuiltValueField(wireName: r'supportedheaders')
  ConfigNodePropertyArray? get supportedheaders;

  @BuiltValueField(wireName: r'supportedmethods')
  ConfigNodePropertyArray? get supportedmethods;

  @BuiltValueField(wireName: r'supportscredentials')
  ConfigNodePropertyBoolean? get supportscredentials;

  ComAdobeGraniteCorsImplCORSPolicyImplProperties._();

  factory ComAdobeGraniteCorsImplCORSPolicyImplProperties([void updates(ComAdobeGraniteCorsImplCORSPolicyImplPropertiesBuilder b)]) = _$ComAdobeGraniteCorsImplCORSPolicyImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteCorsImplCORSPolicyImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteCorsImplCORSPolicyImplProperties> get serializer => _$ComAdobeGraniteCorsImplCORSPolicyImplPropertiesSerializer();
}

class _$ComAdobeGraniteCorsImplCORSPolicyImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteCorsImplCORSPolicyImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteCorsImplCORSPolicyImplProperties, _$ComAdobeGraniteCorsImplCORSPolicyImplProperties];

  @override
  final String wireName = r'ComAdobeGraniteCorsImplCORSPolicyImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteCorsImplCORSPolicyImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.alloworigin != null) {
      yield r'alloworigin';
      yield serializers.serialize(
        object.alloworigin,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.alloworiginregexp != null) {
      yield r'alloworiginregexp';
      yield serializers.serialize(
        object.alloworiginregexp,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.allowedpaths != null) {
      yield r'allowedpaths';
      yield serializers.serialize(
        object.allowedpaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.exposedheaders != null) {
      yield r'exposedheaders';
      yield serializers.serialize(
        object.exposedheaders,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.maxage != null) {
      yield r'maxage';
      yield serializers.serialize(
        object.maxage,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.supportedheaders != null) {
      yield r'supportedheaders';
      yield serializers.serialize(
        object.supportedheaders,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.supportedmethods != null) {
      yield r'supportedmethods';
      yield serializers.serialize(
        object.supportedmethods,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.supportscredentials != null) {
      yield r'supportscredentials';
      yield serializers.serialize(
        object.supportscredentials,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteCorsImplCORSPolicyImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteCorsImplCORSPolicyImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'alloworigin':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.alloworigin.replace(valueDes);
          break;
        case r'alloworiginregexp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.alloworiginregexp.replace(valueDes);
          break;
        case r'allowedpaths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.allowedpaths.replace(valueDes);
          break;
        case r'exposedheaders':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.exposedheaders.replace(valueDes);
          break;
        case r'maxage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxage.replace(valueDes);
          break;
        case r'supportedheaders':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.supportedheaders.replace(valueDes);
          break;
        case r'supportedmethods':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.supportedmethods.replace(valueDes);
          break;
        case r'supportscredentials':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.supportscredentials.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteCorsImplCORSPolicyImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteCorsImplCORSPolicyImplPropertiesBuilder();
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

