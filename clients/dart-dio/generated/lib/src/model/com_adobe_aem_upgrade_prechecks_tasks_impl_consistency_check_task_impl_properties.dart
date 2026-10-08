//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties.g.dart';

/// ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties
///
/// Properties:
/// * [rootPeriodPath] 
/// * [fixPeriodInconsistencies] 
@BuiltValue()
abstract class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties implements Built<ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties, ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'root.path')
  ConfigNodePropertyString? get rootPeriodPath;

  @BuiltValueField(wireName: r'fix.inconsistencies')
  ConfigNodePropertyBoolean? get fixPeriodInconsistencies;

  ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties._();

  factory ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties([void updates(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesBuilder b)]) = _$ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties> get serializer => _$ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesSerializer();
}

class _$ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties, _$ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties];

  @override
  final String wireName = r'ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.rootPeriodPath != null) {
      yield r'root.path';
      yield serializers.serialize(
        object.rootPeriodPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.fixPeriodInconsistencies != null) {
      yield r'fix.inconsistencies';
      yield serializers.serialize(
        object.fixPeriodInconsistencies,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'root.path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.rootPeriodPath.replace(valueDes);
          break;
        case r'fix.inconsistencies':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.fixPeriodInconsistencies.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesBuilder();
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

