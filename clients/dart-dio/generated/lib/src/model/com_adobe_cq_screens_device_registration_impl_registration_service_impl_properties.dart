//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_screens_device_registration_impl_registration_service_impl_properties.g.dart';

/// ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties
///
/// Properties:
/// * [deviceRegistrationTimeout] 
@BuiltValue()
abstract class ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties implements Built<ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties, ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'deviceRegistrationTimeout')
  ConfigNodePropertyInteger? get deviceRegistrationTimeout;

  ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties._();

  factory ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties([void updates(ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplPropertiesBuilder b)]) = _$ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties> get serializer => _$ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplPropertiesSerializer();
}

class _$ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties, _$ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties];

  @override
  final String wireName = r'ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.deviceRegistrationTimeout != null) {
      yield r'deviceRegistrationTimeout';
      yield serializers.serialize(
        object.deviceRegistrationTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'deviceRegistrationTimeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.deviceRegistrationTimeout.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplPropertiesBuilder();
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

