//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor_properties.g.dart';

/// ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties
///
/// Properties:
/// * [adapterPeriodCondition] 
/// * [taskmanagerPeriodAdmingroups] 
@BuiltValue()
abstract class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties implements Built<ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties, ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorPropertiesBuilder> {
  @BuiltValueField(wireName: r'adapter.condition')
  ConfigNodePropertyString? get adapterPeriodCondition;

  @BuiltValueField(wireName: r'taskmanager.admingroups')
  ConfigNodePropertyArray? get taskmanagerPeriodAdmingroups;

  ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties._();

  factory ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties([void updates(ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorPropertiesBuilder b)]) = _$ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties> get serializer => _$ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorPropertiesSerializer();
}

class _$ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties, _$ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties];

  @override
  final String wireName = r'ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adapterPeriodCondition != null) {
      yield r'adapter.condition';
      yield serializers.serialize(
        object.adapterPeriodCondition,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.taskmanagerPeriodAdmingroups != null) {
      yield r'taskmanager.admingroups';
      yield serializers.serialize(
        object.taskmanagerPeriodAdmingroups,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'adapter.condition':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.adapterPeriodCondition.replace(valueDes);
          break;
        case r'taskmanager.admingroups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.taskmanagerPeriodAdmingroups.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorPropertiesBuilder();
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

