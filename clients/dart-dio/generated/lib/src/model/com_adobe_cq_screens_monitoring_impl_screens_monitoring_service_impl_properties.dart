//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_properties.g.dart';

/// ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties
///
/// Properties:
/// * [comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodProjectPath] 
/// * [comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodScheduleFrequency] 
/// * [comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodPingTimeout] 
/// * [comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodRecipients] 
/// * [comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodSmtpserver] 
/// * [comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodSmtpport] 
/// * [comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodUsetls] 
/// * [comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodUsername] 
/// * [comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodPassword] 
@BuiltValue()
abstract class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties implements Built<ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties, ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath')
  ConfigNodePropertyArray? get comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodProjectPath;

  @BuiltValueField(wireName: r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency')
  ConfigNodePropertyString? get comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodScheduleFrequency;

  @BuiltValueField(wireName: r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout')
  ConfigNodePropertyInteger? get comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodPingTimeout;

  @BuiltValueField(wireName: r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients')
  ConfigNodePropertyString? get comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodRecipients;

  @BuiltValueField(wireName: r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver')
  ConfigNodePropertyString? get comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodSmtpserver;

  @BuiltValueField(wireName: r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport')
  ConfigNodePropertyInteger? get comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodSmtpport;

  @BuiltValueField(wireName: r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls')
  ConfigNodePropertyBoolean? get comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodUsetls;

  @BuiltValueField(wireName: r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username')
  ConfigNodePropertyString? get comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodUsername;

  @BuiltValueField(wireName: r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password')
  ConfigNodePropertyString? get comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodPassword;

  ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties._();

  factory ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties([void updates(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesBuilder b)]) = _$ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties> get serializer => _$ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesSerializer();
}

class _$ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties, _$ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties];

  @override
  final String wireName = r'ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodProjectPath != null) {
      yield r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath';
      yield serializers.serialize(
        object.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodProjectPath,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodScheduleFrequency != null) {
      yield r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency';
      yield serializers.serialize(
        object.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodScheduleFrequency,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodPingTimeout != null) {
      yield r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout';
      yield serializers.serialize(
        object.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodPingTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodRecipients != null) {
      yield r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients';
      yield serializers.serialize(
        object.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodRecipients,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodSmtpserver != null) {
      yield r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver';
      yield serializers.serialize(
        object.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodSmtpserver,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodSmtpport != null) {
      yield r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport';
      yield serializers.serialize(
        object.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodSmtpport,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodUsetls != null) {
      yield r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls';
      yield serializers.serialize(
        object.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodUsetls,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodUsername != null) {
      yield r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username';
      yield serializers.serialize(
        object.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodUsername,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodPassword != null) {
      yield r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password';
      yield serializers.serialize(
        object.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodPassword,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodProjectPath.replace(valueDes);
          break;
        case r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodScheduleFrequency.replace(valueDes);
          break;
        case r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodPingTimeout.replace(valueDes);
          break;
        case r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodRecipients.replace(valueDes);
          break;
        case r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodSmtpserver.replace(valueDes);
          break;
        case r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodSmtpport.replace(valueDes);
          break;
        case r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodUsetls.replace(valueDes);
          break;
        case r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodUsername.replace(valueDes);
          break;
        case r'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodCqPeriodScreensPeriodMonitoringPeriodImplPeriodScreensMonitoringServiceImplPeriodPassword.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesBuilder();
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

