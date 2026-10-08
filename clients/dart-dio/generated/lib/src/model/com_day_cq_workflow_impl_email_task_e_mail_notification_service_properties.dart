//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties.g.dart';

/// ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties
///
/// Properties:
/// * [notifyPeriodOnupdate] 
/// * [notifyPeriodOncomplete] 
@BuiltValue()
abstract class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties implements Built<ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties, ComDayCqWorkflowImplEmailTaskEMailNotificationServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'notify.onupdate')
  ConfigNodePropertyBoolean? get notifyPeriodOnupdate;

  @BuiltValueField(wireName: r'notify.oncomplete')
  ConfigNodePropertyBoolean? get notifyPeriodOncomplete;

  ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties._();

  factory ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties([void updates(ComDayCqWorkflowImplEmailTaskEMailNotificationServicePropertiesBuilder b)]) = _$ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWorkflowImplEmailTaskEMailNotificationServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties> get serializer => _$ComDayCqWorkflowImplEmailTaskEMailNotificationServicePropertiesSerializer();
}

class _$ComDayCqWorkflowImplEmailTaskEMailNotificationServicePropertiesSerializer implements PrimitiveSerializer<ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties, _$ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties];

  @override
  final String wireName = r'ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.notifyPeriodOnupdate != null) {
      yield r'notify.onupdate';
      yield serializers.serialize(
        object.notifyPeriodOnupdate,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.notifyPeriodOncomplete != null) {
      yield r'notify.oncomplete';
      yield serializers.serialize(
        object.notifyPeriodOncomplete,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWorkflowImplEmailTaskEMailNotificationServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'notify.onupdate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.notifyPeriodOnupdate.replace(valueDes);
          break;
        case r'notify.oncomplete':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.notifyPeriodOncomplete.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWorkflowImplEmailTaskEMailNotificationServicePropertiesBuilder();
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

