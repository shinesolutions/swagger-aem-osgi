//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_screens_device_impl_device_service_properties.g.dart';

/// ComAdobeCqScreensDeviceImplDeviceServiceProperties
///
/// Properties:
/// * [comPeriodAdobePeriodAemPeriodScreensPeriodPlayerPeriodPingfrequency] 
/// * [comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodSpecialchars] 
/// * [comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinlowercasechars] 
/// * [comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinuppercasechars] 
/// * [comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinnumberchars] 
/// * [comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinspecialchars] 
/// * [comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinlength] 
@BuiltValue()
abstract class ComAdobeCqScreensDeviceImplDeviceServiceProperties implements Built<ComAdobeCqScreensDeviceImplDeviceServiceProperties, ComAdobeCqScreensDeviceImplDeviceServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'com.adobe.aem.screens.player.pingfrequency')
  ConfigNodePropertyInteger? get comPeriodAdobePeriodAemPeriodScreensPeriodPlayerPeriodPingfrequency;

  @BuiltValueField(wireName: r'com.adobe.aem.screens.device.pasword.specialchars')
  ConfigNodePropertyString? get comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodSpecialchars;

  @BuiltValueField(wireName: r'com.adobe.aem.screens.device.pasword.minlowercasechars')
  ConfigNodePropertyInteger? get comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinlowercasechars;

  @BuiltValueField(wireName: r'com.adobe.aem.screens.device.pasword.minuppercasechars')
  ConfigNodePropertyInteger? get comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinuppercasechars;

  @BuiltValueField(wireName: r'com.adobe.aem.screens.device.pasword.minnumberchars')
  ConfigNodePropertyInteger? get comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinnumberchars;

  @BuiltValueField(wireName: r'com.adobe.aem.screens.device.pasword.minspecialchars')
  ConfigNodePropertyInteger? get comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinspecialchars;

  @BuiltValueField(wireName: r'com.adobe.aem.screens.device.pasword.minlength')
  ConfigNodePropertyInteger? get comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinlength;

  ComAdobeCqScreensDeviceImplDeviceServiceProperties._();

  factory ComAdobeCqScreensDeviceImplDeviceServiceProperties([void updates(ComAdobeCqScreensDeviceImplDeviceServicePropertiesBuilder b)]) = _$ComAdobeCqScreensDeviceImplDeviceServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqScreensDeviceImplDeviceServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqScreensDeviceImplDeviceServiceProperties> get serializer => _$ComAdobeCqScreensDeviceImplDeviceServicePropertiesSerializer();
}

class _$ComAdobeCqScreensDeviceImplDeviceServicePropertiesSerializer implements PrimitiveSerializer<ComAdobeCqScreensDeviceImplDeviceServiceProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqScreensDeviceImplDeviceServiceProperties, _$ComAdobeCqScreensDeviceImplDeviceServiceProperties];

  @override
  final String wireName = r'ComAdobeCqScreensDeviceImplDeviceServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqScreensDeviceImplDeviceServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.comPeriodAdobePeriodAemPeriodScreensPeriodPlayerPeriodPingfrequency != null) {
      yield r'com.adobe.aem.screens.player.pingfrequency';
      yield serializers.serialize(
        object.comPeriodAdobePeriodAemPeriodScreensPeriodPlayerPeriodPingfrequency,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodSpecialchars != null) {
      yield r'com.adobe.aem.screens.device.pasword.specialchars';
      yield serializers.serialize(
        object.comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodSpecialchars,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinlowercasechars != null) {
      yield r'com.adobe.aem.screens.device.pasword.minlowercasechars';
      yield serializers.serialize(
        object.comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinlowercasechars,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinuppercasechars != null) {
      yield r'com.adobe.aem.screens.device.pasword.minuppercasechars';
      yield serializers.serialize(
        object.comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinuppercasechars,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinnumberchars != null) {
      yield r'com.adobe.aem.screens.device.pasword.minnumberchars';
      yield serializers.serialize(
        object.comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinnumberchars,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinspecialchars != null) {
      yield r'com.adobe.aem.screens.device.pasword.minspecialchars';
      yield serializers.serialize(
        object.comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinspecialchars,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinlength != null) {
      yield r'com.adobe.aem.screens.device.pasword.minlength';
      yield serializers.serialize(
        object.comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinlength,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqScreensDeviceImplDeviceServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqScreensDeviceImplDeviceServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'com.adobe.aem.screens.player.pingfrequency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodAemPeriodScreensPeriodPlayerPeriodPingfrequency.replace(valueDes);
          break;
        case r'com.adobe.aem.screens.device.pasword.specialchars':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodSpecialchars.replace(valueDes);
          break;
        case r'com.adobe.aem.screens.device.pasword.minlowercasechars':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinlowercasechars.replace(valueDes);
          break;
        case r'com.adobe.aem.screens.device.pasword.minuppercasechars':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinuppercasechars.replace(valueDes);
          break;
        case r'com.adobe.aem.screens.device.pasword.minnumberchars':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinnumberchars.replace(valueDes);
          break;
        case r'com.adobe.aem.screens.device.pasword.minspecialchars':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinspecialchars.replace(valueDes);
          break;
        case r'com.adobe.aem.screens.device.pasword.minlength':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodAemPeriodScreensPeriodDevicePeriodPaswordPeriodMinlength.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqScreensDeviceImplDeviceServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqScreensDeviceImplDeviceServicePropertiesBuilder();
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

