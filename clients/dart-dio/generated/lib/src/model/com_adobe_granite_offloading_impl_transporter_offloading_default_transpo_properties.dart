//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties.g.dart';

/// ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties
///
/// Properties:
/// * [defaultPeriodTransportPeriodAgentToWorkerPeriodPrefix] 
/// * [defaultPeriodTransportPeriodAgentToMasterPeriodPrefix] 
/// * [defaultPeriodTransportPeriodInputPeriodPackage] 
/// * [defaultPeriodTransportPeriodOutputPeriodPackage] 
/// * [defaultPeriodTransportPeriodReplicationPeriodSynchronous] 
/// * [defaultPeriodTransportPeriodContentpackage] 
/// * [offloadingPeriodTransporterPeriodDefaultPeriodEnabled] 
@BuiltValue()
abstract class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties implements Built<ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties, ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesBuilder> {
  @BuiltValueField(wireName: r'default.transport.agent-to-worker.prefix')
  ConfigNodePropertyString? get defaultPeriodTransportPeriodAgentToWorkerPeriodPrefix;

  @BuiltValueField(wireName: r'default.transport.agent-to-master.prefix')
  ConfigNodePropertyString? get defaultPeriodTransportPeriodAgentToMasterPeriodPrefix;

  @BuiltValueField(wireName: r'default.transport.input.package')
  ConfigNodePropertyString? get defaultPeriodTransportPeriodInputPeriodPackage;

  @BuiltValueField(wireName: r'default.transport.output.package')
  ConfigNodePropertyString? get defaultPeriodTransportPeriodOutputPeriodPackage;

  @BuiltValueField(wireName: r'default.transport.replication.synchronous')
  ConfigNodePropertyBoolean? get defaultPeriodTransportPeriodReplicationPeriodSynchronous;

  @BuiltValueField(wireName: r'default.transport.contentpackage')
  ConfigNodePropertyBoolean? get defaultPeriodTransportPeriodContentpackage;

  @BuiltValueField(wireName: r'offloading.transporter.default.enabled')
  ConfigNodePropertyBoolean? get offloadingPeriodTransporterPeriodDefaultPeriodEnabled;

  ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties._();

  factory ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties([void updates(ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesBuilder b)]) = _$ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties> get serializer => _$ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesSerializer();
}

class _$ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties, _$ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties];

  @override
  final String wireName = r'ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.defaultPeriodTransportPeriodAgentToWorkerPeriodPrefix != null) {
      yield r'default.transport.agent-to-worker.prefix';
      yield serializers.serialize(
        object.defaultPeriodTransportPeriodAgentToWorkerPeriodPrefix,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.defaultPeriodTransportPeriodAgentToMasterPeriodPrefix != null) {
      yield r'default.transport.agent-to-master.prefix';
      yield serializers.serialize(
        object.defaultPeriodTransportPeriodAgentToMasterPeriodPrefix,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.defaultPeriodTransportPeriodInputPeriodPackage != null) {
      yield r'default.transport.input.package';
      yield serializers.serialize(
        object.defaultPeriodTransportPeriodInputPeriodPackage,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.defaultPeriodTransportPeriodOutputPeriodPackage != null) {
      yield r'default.transport.output.package';
      yield serializers.serialize(
        object.defaultPeriodTransportPeriodOutputPeriodPackage,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.defaultPeriodTransportPeriodReplicationPeriodSynchronous != null) {
      yield r'default.transport.replication.synchronous';
      yield serializers.serialize(
        object.defaultPeriodTransportPeriodReplicationPeriodSynchronous,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.defaultPeriodTransportPeriodContentpackage != null) {
      yield r'default.transport.contentpackage';
      yield serializers.serialize(
        object.defaultPeriodTransportPeriodContentpackage,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.offloadingPeriodTransporterPeriodDefaultPeriodEnabled != null) {
      yield r'offloading.transporter.default.enabled';
      yield serializers.serialize(
        object.offloadingPeriodTransporterPeriodDefaultPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'default.transport.agent-to-worker.prefix':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.defaultPeriodTransportPeriodAgentToWorkerPeriodPrefix.replace(valueDes);
          break;
        case r'default.transport.agent-to-master.prefix':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.defaultPeriodTransportPeriodAgentToMasterPeriodPrefix.replace(valueDes);
          break;
        case r'default.transport.input.package':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.defaultPeriodTransportPeriodInputPeriodPackage.replace(valueDes);
          break;
        case r'default.transport.output.package':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.defaultPeriodTransportPeriodOutputPeriodPackage.replace(valueDes);
          break;
        case r'default.transport.replication.synchronous':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.defaultPeriodTransportPeriodReplicationPeriodSynchronous.replace(valueDes);
          break;
        case r'default.transport.contentpackage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.defaultPeriodTransportPeriodContentpackage.replace(valueDes);
          break;
        case r'offloading.transporter.default.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.offloadingPeriodTransporterPeriodDefaultPeriodEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesBuilder();
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

