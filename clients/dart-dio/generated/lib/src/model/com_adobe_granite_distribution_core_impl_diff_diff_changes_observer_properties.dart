//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties.g.dart';

/// ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties
///
/// Properties:
/// * [enabled] 
/// * [agentName] 
/// * [diffPath] 
/// * [observedPath] 
/// * [serviceName] 
/// * [propertyNames] 
/// * [distributionDelay] 
/// * [serviceUserPeriodTarget] 
@BuiltValue()
abstract class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties implements Built<ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties, ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesBuilder> {
  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  @BuiltValueField(wireName: r'agentName')
  ConfigNodePropertyString? get agentName;

  @BuiltValueField(wireName: r'diffPath')
  ConfigNodePropertyString? get diffPath;

  @BuiltValueField(wireName: r'observedPath')
  ConfigNodePropertyString? get observedPath;

  @BuiltValueField(wireName: r'serviceName')
  ConfigNodePropertyString? get serviceName;

  @BuiltValueField(wireName: r'propertyNames')
  ConfigNodePropertyString? get propertyNames;

  @BuiltValueField(wireName: r'distributionDelay')
  ConfigNodePropertyInteger? get distributionDelay;

  @BuiltValueField(wireName: r'serviceUser.target')
  ConfigNodePropertyString? get serviceUserPeriodTarget;

  ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties._();

  factory ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties([void updates(ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesBuilder b)]) = _$ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties> get serializer => _$ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesSerializer();
}

class _$ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties, _$ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties];

  @override
  final String wireName = r'ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.enabled != null) {
      yield r'enabled';
      yield serializers.serialize(
        object.enabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.agentName != null) {
      yield r'agentName';
      yield serializers.serialize(
        object.agentName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.diffPath != null) {
      yield r'diffPath';
      yield serializers.serialize(
        object.diffPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.observedPath != null) {
      yield r'observedPath';
      yield serializers.serialize(
        object.observedPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.serviceName != null) {
      yield r'serviceName';
      yield serializers.serialize(
        object.serviceName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.propertyNames != null) {
      yield r'propertyNames';
      yield serializers.serialize(
        object.propertyNames,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.distributionDelay != null) {
      yield r'distributionDelay';
      yield serializers.serialize(
        object.distributionDelay,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.serviceUserPeriodTarget != null) {
      yield r'serviceUser.target';
      yield serializers.serialize(
        object.serviceUserPeriodTarget,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enabled.replace(valueDes);
          break;
        case r'agentName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.agentName.replace(valueDes);
          break;
        case r'diffPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.diffPath.replace(valueDes);
          break;
        case r'observedPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.observedPath.replace(valueDes);
          break;
        case r'serviceName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.serviceName.replace(valueDes);
          break;
        case r'propertyNames':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.propertyNames.replace(valueDes);
          break;
        case r'distributionDelay':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.distributionDelay.replace(valueDes);
          break;
        case r'serviceUser.target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.serviceUserPeriodTarget.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesBuilder();
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

