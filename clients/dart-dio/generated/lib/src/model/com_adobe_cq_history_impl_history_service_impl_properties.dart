//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_history_impl_history_service_impl_properties.g.dart';

/// ComAdobeCqHistoryImplHistoryServiceImplProperties
///
/// Properties:
/// * [historyPeriodServicePeriodResourceTypes] 
/// * [historyPeriodServicePeriodPathFilter] 
@BuiltValue()
abstract class ComAdobeCqHistoryImplHistoryServiceImplProperties implements Built<ComAdobeCqHistoryImplHistoryServiceImplProperties, ComAdobeCqHistoryImplHistoryServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'history.service.resourceTypes')
  ConfigNodePropertyArray? get historyPeriodServicePeriodResourceTypes;

  @BuiltValueField(wireName: r'history.service.pathFilter')
  ConfigNodePropertyArray? get historyPeriodServicePeriodPathFilter;

  ComAdobeCqHistoryImplHistoryServiceImplProperties._();

  factory ComAdobeCqHistoryImplHistoryServiceImplProperties([void updates(ComAdobeCqHistoryImplHistoryServiceImplPropertiesBuilder b)]) = _$ComAdobeCqHistoryImplHistoryServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqHistoryImplHistoryServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqHistoryImplHistoryServiceImplProperties> get serializer => _$ComAdobeCqHistoryImplHistoryServiceImplPropertiesSerializer();
}

class _$ComAdobeCqHistoryImplHistoryServiceImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqHistoryImplHistoryServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqHistoryImplHistoryServiceImplProperties, _$ComAdobeCqHistoryImplHistoryServiceImplProperties];

  @override
  final String wireName = r'ComAdobeCqHistoryImplHistoryServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqHistoryImplHistoryServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.historyPeriodServicePeriodResourceTypes != null) {
      yield r'history.service.resourceTypes';
      yield serializers.serialize(
        object.historyPeriodServicePeriodResourceTypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.historyPeriodServicePeriodPathFilter != null) {
      yield r'history.service.pathFilter';
      yield serializers.serialize(
        object.historyPeriodServicePeriodPathFilter,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqHistoryImplHistoryServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqHistoryImplHistoryServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'history.service.resourceTypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.historyPeriodServicePeriodResourceTypes.replace(valueDes);
          break;
        case r'history.service.pathFilter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.historyPeriodServicePeriodPathFilter.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqHistoryImplHistoryServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqHistoryImplHistoryServiceImplPropertiesBuilder();
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

