//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties.g.dart';

/// ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties
///
/// Properties:
/// * [tempStorageConfig] 
@BuiltValue()
abstract class ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties implements Built<ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties, ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpPropertiesBuilder> {
  @BuiltValueField(wireName: r'tempStorageConfig')
  ConfigNodePropertyDropDown? get tempStorageConfig;

  ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties._();

  factory ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties([void updates(ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpPropertiesBuilder b)]) = _$ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties> get serializer => _$ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpPropertiesSerializer();
}

class _$ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpPropertiesSerializer implements PrimitiveSerializer<ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties, _$ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties];

  @override
  final String wireName = r'ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.tempStorageConfig != null) {
      yield r'tempStorageConfig';
      yield serializers.serialize(
        object.tempStorageConfig,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'tempStorageConfig':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.tempStorageConfig.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpPropertiesBuilder();
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

