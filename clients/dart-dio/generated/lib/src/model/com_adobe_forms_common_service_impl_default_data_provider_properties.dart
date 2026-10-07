//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_forms_common_service_impl_default_data_provider_properties.g.dart';

/// ComAdobeFormsCommonServiceImplDefaultDataProviderProperties
///
/// Properties:
/// * [alloweddataFileLocations] 
@BuiltValue()
abstract class ComAdobeFormsCommonServiceImplDefaultDataProviderProperties implements Built<ComAdobeFormsCommonServiceImplDefaultDataProviderProperties, ComAdobeFormsCommonServiceImplDefaultDataProviderPropertiesBuilder> {
  @BuiltValueField(wireName: r'alloweddataFileLocations')
  ConfigNodePropertyArray? get alloweddataFileLocations;

  ComAdobeFormsCommonServiceImplDefaultDataProviderProperties._();

  factory ComAdobeFormsCommonServiceImplDefaultDataProviderProperties([void updates(ComAdobeFormsCommonServiceImplDefaultDataProviderPropertiesBuilder b)]) = _$ComAdobeFormsCommonServiceImplDefaultDataProviderProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeFormsCommonServiceImplDefaultDataProviderPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeFormsCommonServiceImplDefaultDataProviderProperties> get serializer => _$ComAdobeFormsCommonServiceImplDefaultDataProviderPropertiesSerializer();
}

class _$ComAdobeFormsCommonServiceImplDefaultDataProviderPropertiesSerializer implements PrimitiveSerializer<ComAdobeFormsCommonServiceImplDefaultDataProviderProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeFormsCommonServiceImplDefaultDataProviderProperties, _$ComAdobeFormsCommonServiceImplDefaultDataProviderProperties];

  @override
  final String wireName = r'ComAdobeFormsCommonServiceImplDefaultDataProviderProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeFormsCommonServiceImplDefaultDataProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.alloweddataFileLocations != null) {
      yield r'alloweddataFileLocations';
      yield serializers.serialize(
        object.alloweddataFileLocations,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeFormsCommonServiceImplDefaultDataProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeFormsCommonServiceImplDefaultDataProviderPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'alloweddataFileLocations':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.alloweddataFileLocations.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeFormsCommonServiceImplDefaultDataProviderProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeFormsCommonServiceImplDefaultDataProviderPropertiesBuilder();
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

