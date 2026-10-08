//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties.g.dart';

/// ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties
///
/// Properties:
/// * [workflowpackageinfoproviderPeriodFilter] 
/// * [workflowpackageinfoproviderPeriodFilterPeriodRootpath] 
@BuiltValue()
abstract class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties implements Built<ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties, ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderPropertiesBuilder> {
  @BuiltValueField(wireName: r'workflowpackageinfoprovider.filter')
  ConfigNodePropertyArray? get workflowpackageinfoproviderPeriodFilter;

  @BuiltValueField(wireName: r'workflowpackageinfoprovider.filter.rootpath')
  ConfigNodePropertyString? get workflowpackageinfoproviderPeriodFilterPeriodRootpath;

  ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties._();

  factory ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties([void updates(ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderPropertiesBuilder b)]) = _$ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties> get serializer => _$ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderPropertiesSerializer();
}

class _$ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties, _$ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties];

  @override
  final String wireName = r'ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.workflowpackageinfoproviderPeriodFilter != null) {
      yield r'workflowpackageinfoprovider.filter';
      yield serializers.serialize(
        object.workflowpackageinfoproviderPeriodFilter,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.workflowpackageinfoproviderPeriodFilterPeriodRootpath != null) {
      yield r'workflowpackageinfoprovider.filter.rootpath';
      yield serializers.serialize(
        object.workflowpackageinfoproviderPeriodFilterPeriodRootpath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'workflowpackageinfoprovider.filter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.workflowpackageinfoproviderPeriodFilter.replace(valueDes);
          break;
        case r'workflowpackageinfoprovider.filter.rootpath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.workflowpackageinfoproviderPeriodFilterPeriodRootpath.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderPropertiesBuilder();
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

