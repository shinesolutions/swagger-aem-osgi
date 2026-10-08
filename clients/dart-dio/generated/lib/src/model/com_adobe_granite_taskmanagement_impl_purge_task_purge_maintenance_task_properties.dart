//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties.g.dart';

/// ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties
///
/// Properties:
/// * [purgeCompleted] 
/// * [completedAge] 
/// * [purgeActive] 
/// * [activeAge] 
/// * [saveThreshold] 
@BuiltValue()
abstract class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties implements Built<ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties, ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesBuilder> {
  @BuiltValueField(wireName: r'purgeCompleted')
  ConfigNodePropertyBoolean? get purgeCompleted;

  @BuiltValueField(wireName: r'completedAge')
  ConfigNodePropertyInteger? get completedAge;

  @BuiltValueField(wireName: r'purgeActive')
  ConfigNodePropertyBoolean? get purgeActive;

  @BuiltValueField(wireName: r'activeAge')
  ConfigNodePropertyInteger? get activeAge;

  @BuiltValueField(wireName: r'saveThreshold')
  ConfigNodePropertyInteger? get saveThreshold;

  ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties._();

  factory ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties([void updates(ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesBuilder b)]) = _$ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties> get serializer => _$ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesSerializer();
}

class _$ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties, _$ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties];

  @override
  final String wireName = r'ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.purgeCompleted != null) {
      yield r'purgeCompleted';
      yield serializers.serialize(
        object.purgeCompleted,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.completedAge != null) {
      yield r'completedAge';
      yield serializers.serialize(
        object.completedAge,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.purgeActive != null) {
      yield r'purgeActive';
      yield serializers.serialize(
        object.purgeActive,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.activeAge != null) {
      yield r'activeAge';
      yield serializers.serialize(
        object.activeAge,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.saveThreshold != null) {
      yield r'saveThreshold';
      yield serializers.serialize(
        object.saveThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'purgeCompleted':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.purgeCompleted.replace(valueDes);
          break;
        case r'completedAge':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.completedAge.replace(valueDes);
          break;
        case r'purgeActive':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.purgeActive.replace(valueDes);
          break;
        case r'activeAge':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.activeAge.replace(valueDes);
          break;
        case r'saveThreshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.saveThreshold.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesBuilder();
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

