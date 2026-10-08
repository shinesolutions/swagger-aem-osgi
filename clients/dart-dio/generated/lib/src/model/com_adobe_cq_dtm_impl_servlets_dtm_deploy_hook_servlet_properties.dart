//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties.g.dart';

/// ComAdobeCqDtmImplServletsDTMDeployHookServletProperties
///
/// Properties:
/// * [dtmPeriodStagingPeriodIpPeriodWhitelist] 
/// * [dtmPeriodProductionPeriodIpPeriodWhitelist] 
@BuiltValue()
abstract class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties implements Built<ComAdobeCqDtmImplServletsDTMDeployHookServletProperties, ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'dtm.staging.ip.whitelist')
  ConfigNodePropertyArray? get dtmPeriodStagingPeriodIpPeriodWhitelist;

  @BuiltValueField(wireName: r'dtm.production.ip.whitelist')
  ConfigNodePropertyArray? get dtmPeriodProductionPeriodIpPeriodWhitelist;

  ComAdobeCqDtmImplServletsDTMDeployHookServletProperties._();

  factory ComAdobeCqDtmImplServletsDTMDeployHookServletProperties([void updates(ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesBuilder b)]) = _$ComAdobeCqDtmImplServletsDTMDeployHookServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqDtmImplServletsDTMDeployHookServletProperties> get serializer => _$ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesSerializer();
}

class _$ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqDtmImplServletsDTMDeployHookServletProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqDtmImplServletsDTMDeployHookServletProperties, _$ComAdobeCqDtmImplServletsDTMDeployHookServletProperties];

  @override
  final String wireName = r'ComAdobeCqDtmImplServletsDTMDeployHookServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqDtmImplServletsDTMDeployHookServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.dtmPeriodStagingPeriodIpPeriodWhitelist != null) {
      yield r'dtm.staging.ip.whitelist';
      yield serializers.serialize(
        object.dtmPeriodStagingPeriodIpPeriodWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.dtmPeriodProductionPeriodIpPeriodWhitelist != null) {
      yield r'dtm.production.ip.whitelist';
      yield serializers.serialize(
        object.dtmPeriodProductionPeriodIpPeriodWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqDtmImplServletsDTMDeployHookServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'dtm.staging.ip.whitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.dtmPeriodStagingPeriodIpPeriodWhitelist.replace(valueDes);
          break;
        case r'dtm.production.ip.whitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.dtmPeriodProductionPeriodIpPeriodWhitelist.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqDtmImplServletsDTMDeployHookServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesBuilder();
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

