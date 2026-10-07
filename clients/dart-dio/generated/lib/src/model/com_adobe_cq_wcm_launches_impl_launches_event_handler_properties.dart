//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_wcm_launches_impl_launches_event_handler_properties.g.dart';

/// ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties
///
/// Properties:
/// * [eventPeriodFilter] 
/// * [launchesPeriodEventhandlerPeriodThreadpoolPeriodMaxsize] 
/// * [launchesPeriodEventhandlerPeriodThreadpoolPeriodPriority] 
/// * [launchesPeriodEventhandlerPeriodUpdatelastmodification] 
@BuiltValue()
abstract class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties implements Built<ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties, ComAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'event.filter')
  ConfigNodePropertyString? get eventPeriodFilter;

  @BuiltValueField(wireName: r'launches.eventhandler.threadpool.maxsize')
  ConfigNodePropertyInteger? get launchesPeriodEventhandlerPeriodThreadpoolPeriodMaxsize;

  @BuiltValueField(wireName: r'launches.eventhandler.threadpool.priority')
  ConfigNodePropertyDropDown? get launchesPeriodEventhandlerPeriodThreadpoolPeriodPriority;

  @BuiltValueField(wireName: r'launches.eventhandler.updatelastmodification')
  ConfigNodePropertyBoolean? get launchesPeriodEventhandlerPeriodUpdatelastmodification;

  ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties._();

  factory ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties([void updates(ComAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesBuilder b)]) = _$ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties> get serializer => _$ComAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesSerializer();
}

class _$ComAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties, _$ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties];

  @override
  final String wireName = r'ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.eventPeriodFilter != null) {
      yield r'event.filter';
      yield serializers.serialize(
        object.eventPeriodFilter,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.launchesPeriodEventhandlerPeriodThreadpoolPeriodMaxsize != null) {
      yield r'launches.eventhandler.threadpool.maxsize';
      yield serializers.serialize(
        object.launchesPeriodEventhandlerPeriodThreadpoolPeriodMaxsize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.launchesPeriodEventhandlerPeriodThreadpoolPeriodPriority != null) {
      yield r'launches.eventhandler.threadpool.priority';
      yield serializers.serialize(
        object.launchesPeriodEventhandlerPeriodThreadpoolPeriodPriority,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.launchesPeriodEventhandlerPeriodUpdatelastmodification != null) {
      yield r'launches.eventhandler.updatelastmodification';
      yield serializers.serialize(
        object.launchesPeriodEventhandlerPeriodUpdatelastmodification,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event.filter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.eventPeriodFilter.replace(valueDes);
          break;
        case r'launches.eventhandler.threadpool.maxsize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.launchesPeriodEventhandlerPeriodThreadpoolPeriodMaxsize.replace(valueDes);
          break;
        case r'launches.eventhandler.threadpool.priority':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.launchesPeriodEventhandlerPeriodThreadpoolPeriodPriority.replace(valueDes);
          break;
        case r'launches.eventhandler.updatelastmodification':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.launchesPeriodEventhandlerPeriodUpdatelastmodification.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesBuilder();
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

