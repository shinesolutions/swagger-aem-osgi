//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_history_impl_history_request_filter_properties.g.dart';

/// ComAdobeCqHistoryImplHistoryRequestFilterProperties
///
/// Properties:
/// * [historyPeriodRequestFilterPeriodExcludedSelectors] 
/// * [historyPeriodRequestFilterPeriodExcludedExtensions] 
@BuiltValue()
abstract class ComAdobeCqHistoryImplHistoryRequestFilterProperties implements Built<ComAdobeCqHistoryImplHistoryRequestFilterProperties, ComAdobeCqHistoryImplHistoryRequestFilterPropertiesBuilder> {
  @BuiltValueField(wireName: r'history.requestFilter.excludedSelectors')
  ConfigNodePropertyArray? get historyPeriodRequestFilterPeriodExcludedSelectors;

  @BuiltValueField(wireName: r'history.requestFilter.excludedExtensions')
  ConfigNodePropertyArray? get historyPeriodRequestFilterPeriodExcludedExtensions;

  ComAdobeCqHistoryImplHistoryRequestFilterProperties._();

  factory ComAdobeCqHistoryImplHistoryRequestFilterProperties([void updates(ComAdobeCqHistoryImplHistoryRequestFilterPropertiesBuilder b)]) = _$ComAdobeCqHistoryImplHistoryRequestFilterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqHistoryImplHistoryRequestFilterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqHistoryImplHistoryRequestFilterProperties> get serializer => _$ComAdobeCqHistoryImplHistoryRequestFilterPropertiesSerializer();
}

class _$ComAdobeCqHistoryImplHistoryRequestFilterPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqHistoryImplHistoryRequestFilterProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqHistoryImplHistoryRequestFilterProperties, _$ComAdobeCqHistoryImplHistoryRequestFilterProperties];

  @override
  final String wireName = r'ComAdobeCqHistoryImplHistoryRequestFilterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqHistoryImplHistoryRequestFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.historyPeriodRequestFilterPeriodExcludedSelectors != null) {
      yield r'history.requestFilter.excludedSelectors';
      yield serializers.serialize(
        object.historyPeriodRequestFilterPeriodExcludedSelectors,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.historyPeriodRequestFilterPeriodExcludedExtensions != null) {
      yield r'history.requestFilter.excludedExtensions';
      yield serializers.serialize(
        object.historyPeriodRequestFilterPeriodExcludedExtensions,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqHistoryImplHistoryRequestFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqHistoryImplHistoryRequestFilterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'history.requestFilter.excludedSelectors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.historyPeriodRequestFilterPeriodExcludedSelectors.replace(valueDes);
          break;
        case r'history.requestFilter.excludedExtensions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.historyPeriodRequestFilterPeriodExcludedExtensions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqHistoryImplHistoryRequestFilterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqHistoryImplHistoryRequestFilterPropertiesBuilder();
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

