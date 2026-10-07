//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_frags_impl_random_feature_properties.g.dart';

/// ComAdobeGraniteFragsImplRandomFeatureProperties
///
/// Properties:
/// * [featurePeriodName] 
/// * [featurePeriodDescription] 
/// * [activePeriodPercentage] 
/// * [cookiePeriodName] 
/// * [cookiePeriodMaxAge] 
@BuiltValue()
abstract class ComAdobeGraniteFragsImplRandomFeatureProperties implements Built<ComAdobeGraniteFragsImplRandomFeatureProperties, ComAdobeGraniteFragsImplRandomFeaturePropertiesBuilder> {
  @BuiltValueField(wireName: r'feature.name')
  ConfigNodePropertyString? get featurePeriodName;

  @BuiltValueField(wireName: r'feature.description')
  ConfigNodePropertyString? get featurePeriodDescription;

  @BuiltValueField(wireName: r'active.percentage')
  ConfigNodePropertyString? get activePeriodPercentage;

  @BuiltValueField(wireName: r'cookie.name')
  ConfigNodePropertyString? get cookiePeriodName;

  @BuiltValueField(wireName: r'cookie.maxAge')
  ConfigNodePropertyInteger? get cookiePeriodMaxAge;

  ComAdobeGraniteFragsImplRandomFeatureProperties._();

  factory ComAdobeGraniteFragsImplRandomFeatureProperties([void updates(ComAdobeGraniteFragsImplRandomFeaturePropertiesBuilder b)]) = _$ComAdobeGraniteFragsImplRandomFeatureProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteFragsImplRandomFeaturePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteFragsImplRandomFeatureProperties> get serializer => _$ComAdobeGraniteFragsImplRandomFeaturePropertiesSerializer();
}

class _$ComAdobeGraniteFragsImplRandomFeaturePropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteFragsImplRandomFeatureProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteFragsImplRandomFeatureProperties, _$ComAdobeGraniteFragsImplRandomFeatureProperties];

  @override
  final String wireName = r'ComAdobeGraniteFragsImplRandomFeatureProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteFragsImplRandomFeatureProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.featurePeriodName != null) {
      yield r'feature.name';
      yield serializers.serialize(
        object.featurePeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.featurePeriodDescription != null) {
      yield r'feature.description';
      yield serializers.serialize(
        object.featurePeriodDescription,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.activePeriodPercentage != null) {
      yield r'active.percentage';
      yield serializers.serialize(
        object.activePeriodPercentage,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.cookiePeriodName != null) {
      yield r'cookie.name';
      yield serializers.serialize(
        object.cookiePeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.cookiePeriodMaxAge != null) {
      yield r'cookie.maxAge';
      yield serializers.serialize(
        object.cookiePeriodMaxAge,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteFragsImplRandomFeatureProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteFragsImplRandomFeaturePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'feature.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.featurePeriodName.replace(valueDes);
          break;
        case r'feature.description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.featurePeriodDescription.replace(valueDes);
          break;
        case r'active.percentage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.activePeriodPercentage.replace(valueDes);
          break;
        case r'cookie.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cookiePeriodName.replace(valueDes);
          break;
        case r'cookie.maxAge':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cookiePeriodMaxAge.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteFragsImplRandomFeatureProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteFragsImplRandomFeaturePropertiesBuilder();
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

