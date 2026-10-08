//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_workflow_core_workflow_session_factory_properties.g.dart';

/// ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties
///
/// Properties:
/// * [granitePeriodWorkflowinboxPeriodSortPeriodPropertyName] 
/// * [granitePeriodWorkflowinboxPeriodSortPeriodOrder] 
/// * [cqPeriodWorkflowPeriodJobPeriodRetry] 
/// * [cqPeriodWorkflowPeriodSuperuser] 
/// * [granitePeriodWorkflowPeriodInboxQuerySize] 
/// * [granitePeriodWorkflowPeriodAdminUserGroupFilter] 
/// * [granitePeriodWorkflowPeriodEnforceWorkitemAssigneePermissions] 
/// * [granitePeriodWorkflowPeriodEnforceWorkflowInitiatorPermissions] 
/// * [granitePeriodWorkflowPeriodInjectTenantIdInJobTopics] 
/// * [granitePeriodWorkflowPeriodMaxPurgeSaveThreshold] 
/// * [granitePeriodWorkflowPeriodMaxPurgeQueryCount] 
@BuiltValue()
abstract class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties implements Built<ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties, ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'granite.workflowinbox.sort.propertyName')
  ConfigNodePropertyDropDown? get granitePeriodWorkflowinboxPeriodSortPeriodPropertyName;

  @BuiltValueField(wireName: r'granite.workflowinbox.sort.order')
  ConfigNodePropertyString? get granitePeriodWorkflowinboxPeriodSortPeriodOrder;

  @BuiltValueField(wireName: r'cq.workflow.job.retry')
  ConfigNodePropertyInteger? get cqPeriodWorkflowPeriodJobPeriodRetry;

  @BuiltValueField(wireName: r'cq.workflow.superuser')
  ConfigNodePropertyArray? get cqPeriodWorkflowPeriodSuperuser;

  @BuiltValueField(wireName: r'granite.workflow.inboxQuerySize')
  ConfigNodePropertyInteger? get granitePeriodWorkflowPeriodInboxQuerySize;

  @BuiltValueField(wireName: r'granite.workflow.adminUserGroupFilter')
  ConfigNodePropertyBoolean? get granitePeriodWorkflowPeriodAdminUserGroupFilter;

  @BuiltValueField(wireName: r'granite.workflow.enforceWorkitemAssigneePermissions')
  ConfigNodePropertyBoolean? get granitePeriodWorkflowPeriodEnforceWorkitemAssigneePermissions;

  @BuiltValueField(wireName: r'granite.workflow.enforceWorkflowInitiatorPermissions')
  ConfigNodePropertyBoolean? get granitePeriodWorkflowPeriodEnforceWorkflowInitiatorPermissions;

  @BuiltValueField(wireName: r'granite.workflow.injectTenantIdInJobTopics')
  ConfigNodePropertyBoolean? get granitePeriodWorkflowPeriodInjectTenantIdInJobTopics;

  @BuiltValueField(wireName: r'granite.workflow.maxPurgeSaveThreshold')
  ConfigNodePropertyInteger? get granitePeriodWorkflowPeriodMaxPurgeSaveThreshold;

  @BuiltValueField(wireName: r'granite.workflow.maxPurgeQueryCount')
  ConfigNodePropertyInteger? get granitePeriodWorkflowPeriodMaxPurgeQueryCount;

  ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties._();

  factory ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties([void updates(ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder b)]) = _$ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties> get serializer => _$ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesSerializer();
}

class _$ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties, _$ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties];

  @override
  final String wireName = r'ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.granitePeriodWorkflowinboxPeriodSortPeriodPropertyName != null) {
      yield r'granite.workflowinbox.sort.propertyName';
      yield serializers.serialize(
        object.granitePeriodWorkflowinboxPeriodSortPeriodPropertyName,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.granitePeriodWorkflowinboxPeriodSortPeriodOrder != null) {
      yield r'granite.workflowinbox.sort.order';
      yield serializers.serialize(
        object.granitePeriodWorkflowinboxPeriodSortPeriodOrder,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.cqPeriodWorkflowPeriodJobPeriodRetry != null) {
      yield r'cq.workflow.job.retry';
      yield serializers.serialize(
        object.cqPeriodWorkflowPeriodJobPeriodRetry,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cqPeriodWorkflowPeriodSuperuser != null) {
      yield r'cq.workflow.superuser';
      yield serializers.serialize(
        object.cqPeriodWorkflowPeriodSuperuser,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.granitePeriodWorkflowPeriodInboxQuerySize != null) {
      yield r'granite.workflow.inboxQuerySize';
      yield serializers.serialize(
        object.granitePeriodWorkflowPeriodInboxQuerySize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.granitePeriodWorkflowPeriodAdminUserGroupFilter != null) {
      yield r'granite.workflow.adminUserGroupFilter';
      yield serializers.serialize(
        object.granitePeriodWorkflowPeriodAdminUserGroupFilter,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.granitePeriodWorkflowPeriodEnforceWorkitemAssigneePermissions != null) {
      yield r'granite.workflow.enforceWorkitemAssigneePermissions';
      yield serializers.serialize(
        object.granitePeriodWorkflowPeriodEnforceWorkitemAssigneePermissions,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.granitePeriodWorkflowPeriodEnforceWorkflowInitiatorPermissions != null) {
      yield r'granite.workflow.enforceWorkflowInitiatorPermissions';
      yield serializers.serialize(
        object.granitePeriodWorkflowPeriodEnforceWorkflowInitiatorPermissions,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.granitePeriodWorkflowPeriodInjectTenantIdInJobTopics != null) {
      yield r'granite.workflow.injectTenantIdInJobTopics';
      yield serializers.serialize(
        object.granitePeriodWorkflowPeriodInjectTenantIdInJobTopics,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.granitePeriodWorkflowPeriodMaxPurgeSaveThreshold != null) {
      yield r'granite.workflow.maxPurgeSaveThreshold';
      yield serializers.serialize(
        object.granitePeriodWorkflowPeriodMaxPurgeSaveThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.granitePeriodWorkflowPeriodMaxPurgeQueryCount != null) {
      yield r'granite.workflow.maxPurgeQueryCount';
      yield serializers.serialize(
        object.granitePeriodWorkflowPeriodMaxPurgeQueryCount,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'granite.workflowinbox.sort.propertyName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.granitePeriodWorkflowinboxPeriodSortPeriodPropertyName.replace(valueDes);
          break;
        case r'granite.workflowinbox.sort.order':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.granitePeriodWorkflowinboxPeriodSortPeriodOrder.replace(valueDes);
          break;
        case r'cq.workflow.job.retry':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodWorkflowPeriodJobPeriodRetry.replace(valueDes);
          break;
        case r'cq.workflow.superuser':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodWorkflowPeriodSuperuser.replace(valueDes);
          break;
        case r'granite.workflow.inboxQuerySize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.granitePeriodWorkflowPeriodInboxQuerySize.replace(valueDes);
          break;
        case r'granite.workflow.adminUserGroupFilter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.granitePeriodWorkflowPeriodAdminUserGroupFilter.replace(valueDes);
          break;
        case r'granite.workflow.enforceWorkitemAssigneePermissions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.granitePeriodWorkflowPeriodEnforceWorkitemAssigneePermissions.replace(valueDes);
          break;
        case r'granite.workflow.enforceWorkflowInitiatorPermissions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.granitePeriodWorkflowPeriodEnforceWorkflowInitiatorPermissions.replace(valueDes);
          break;
        case r'granite.workflow.injectTenantIdInJobTopics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.granitePeriodWorkflowPeriodInjectTenantIdInJobTopics.replace(valueDes);
          break;
        case r'granite.workflow.maxPurgeSaveThreshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.granitePeriodWorkflowPeriodMaxPurgeSaveThreshold.replace(valueDes);
          break;
        case r'granite.workflow.maxPurgeQueryCount':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.granitePeriodWorkflowPeriodMaxPurgeQueryCount.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesBuilder();
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

