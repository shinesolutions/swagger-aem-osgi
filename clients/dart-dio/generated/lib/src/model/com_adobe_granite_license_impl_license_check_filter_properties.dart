//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_license_impl_license_check_filter_properties.g.dart';

/// ComAdobeGraniteLicenseImplLicenseCheckFilterProperties
///
/// Properties:
/// * [checkInternval] 
/// * [excludeIds] 
/// * [encryptPing] 
@BuiltValue()
abstract class ComAdobeGraniteLicenseImplLicenseCheckFilterProperties implements Built<ComAdobeGraniteLicenseImplLicenseCheckFilterProperties, ComAdobeGraniteLicenseImplLicenseCheckFilterPropertiesBuilder> {
  @BuiltValueField(wireName: r'checkInternval')
  ConfigNodePropertyInteger? get checkInternval;

  @BuiltValueField(wireName: r'excludeIds')
  ConfigNodePropertyArray? get excludeIds;

  @BuiltValueField(wireName: r'encryptPing')
  ConfigNodePropertyBoolean? get encryptPing;

  ComAdobeGraniteLicenseImplLicenseCheckFilterProperties._();

  factory ComAdobeGraniteLicenseImplLicenseCheckFilterProperties([void updates(ComAdobeGraniteLicenseImplLicenseCheckFilterPropertiesBuilder b)]) = _$ComAdobeGraniteLicenseImplLicenseCheckFilterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteLicenseImplLicenseCheckFilterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteLicenseImplLicenseCheckFilterProperties> get serializer => _$ComAdobeGraniteLicenseImplLicenseCheckFilterPropertiesSerializer();
}

class _$ComAdobeGraniteLicenseImplLicenseCheckFilterPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteLicenseImplLicenseCheckFilterProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteLicenseImplLicenseCheckFilterProperties, _$ComAdobeGraniteLicenseImplLicenseCheckFilterProperties];

  @override
  final String wireName = r'ComAdobeGraniteLicenseImplLicenseCheckFilterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteLicenseImplLicenseCheckFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.checkInternval != null) {
      yield r'checkInternval';
      yield serializers.serialize(
        object.checkInternval,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.excludeIds != null) {
      yield r'excludeIds';
      yield serializers.serialize(
        object.excludeIds,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.encryptPing != null) {
      yield r'encryptPing';
      yield serializers.serialize(
        object.encryptPing,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteLicenseImplLicenseCheckFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteLicenseImplLicenseCheckFilterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'checkInternval':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.checkInternval.replace(valueDes);
          break;
        case r'excludeIds':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.excludeIds.replace(valueDes);
          break;
        case r'encryptPing':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.encryptPing.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteLicenseImplLicenseCheckFilterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteLicenseImplLicenseCheckFilterPropertiesBuilder();
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

