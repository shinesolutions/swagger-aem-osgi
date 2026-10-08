//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_workflow_core_workflow_config_properties.g.dart';

/// ComAdobeGraniteWorkflowCoreWorkflowConfigProperties
///
/// Properties:
/// * [cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodPackagesPeriodRootPeriodPath] 
/// * [cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodProcessPeriodLegacyPeriodMode] 
/// * [cqPeriodWorkflowPeriodConfigPeriodAllowPeriodLocking] 
@BuiltValue()
abstract class ComAdobeGraniteWorkflowCoreWorkflowConfigProperties implements Built<ComAdobeGraniteWorkflowCoreWorkflowConfigProperties, ComAdobeGraniteWorkflowCoreWorkflowConfigPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.workflow.config.workflow.packages.root.path')
  ConfigNodePropertyArray? get cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodPackagesPeriodRootPeriodPath;

  @BuiltValueField(wireName: r'cq.workflow.config.workflow.process.legacy.mode')
  ConfigNodePropertyBoolean? get cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodProcessPeriodLegacyPeriodMode;

  @BuiltValueField(wireName: r'cq.workflow.config.allow.locking')
  ConfigNodePropertyBoolean? get cqPeriodWorkflowPeriodConfigPeriodAllowPeriodLocking;

  ComAdobeGraniteWorkflowCoreWorkflowConfigProperties._();

  factory ComAdobeGraniteWorkflowCoreWorkflowConfigProperties([void updates(ComAdobeGraniteWorkflowCoreWorkflowConfigPropertiesBuilder b)]) = _$ComAdobeGraniteWorkflowCoreWorkflowConfigProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteWorkflowCoreWorkflowConfigPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteWorkflowCoreWorkflowConfigProperties> get serializer => _$ComAdobeGraniteWorkflowCoreWorkflowConfigPropertiesSerializer();
}

class _$ComAdobeGraniteWorkflowCoreWorkflowConfigPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteWorkflowCoreWorkflowConfigProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteWorkflowCoreWorkflowConfigProperties, _$ComAdobeGraniteWorkflowCoreWorkflowConfigProperties];

  @override
  final String wireName = r'ComAdobeGraniteWorkflowCoreWorkflowConfigProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteWorkflowCoreWorkflowConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodPackagesPeriodRootPeriodPath != null) {
      yield r'cq.workflow.config.workflow.packages.root.path';
      yield serializers.serialize(
        object.cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodPackagesPeriodRootPeriodPath,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodProcessPeriodLegacyPeriodMode != null) {
      yield r'cq.workflow.config.workflow.process.legacy.mode';
      yield serializers.serialize(
        object.cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodProcessPeriodLegacyPeriodMode,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.cqPeriodWorkflowPeriodConfigPeriodAllowPeriodLocking != null) {
      yield r'cq.workflow.config.allow.locking';
      yield serializers.serialize(
        object.cqPeriodWorkflowPeriodConfigPeriodAllowPeriodLocking,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteWorkflowCoreWorkflowConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteWorkflowCoreWorkflowConfigPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.workflow.config.workflow.packages.root.path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodPackagesPeriodRootPeriodPath.replace(valueDes);
          break;
        case r'cq.workflow.config.workflow.process.legacy.mode':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodProcessPeriodLegacyPeriodMode.replace(valueDes);
          break;
        case r'cq.workflow.config.allow.locking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodWorkflowPeriodConfigPeriodAllowPeriodLocking.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteWorkflowCoreWorkflowConfigProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteWorkflowCoreWorkflowConfigPropertiesBuilder();
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

