//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_info.g.dart';

/// ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo implements Built<ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo, ComDayCqDamS7damCommonS7damDamChangeEventListenerInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties? get properties;

  ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo._();

  factory ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo([void updates(ComDayCqDamS7damCommonS7damDamChangeEventListenerInfoBuilder b)]) = _$ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamS7damCommonS7damDamChangeEventListenerInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo> get serializer => _$ComDayCqDamS7damCommonS7damDamChangeEventListenerInfoSerializer();
}

class _$ComDayCqDamS7damCommonS7damDamChangeEventListenerInfoSerializer implements PrimitiveSerializer<ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo> {
  @override
  final Iterable<Type> types = const [ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo, _$ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo];

  @override
  final String wireName = r'ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pid != null) {
      yield r'pid';
      yield serializers.serialize(
        object.pid,
        specifiedType: const FullType(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.properties != null) {
      yield r'properties';
      yield serializers.serialize(
        object.properties,
        specifiedType: const FullType(ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamS7damCommonS7damDamChangeEventListenerInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pid = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.title = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties),
          ) as ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties?;
          if (valueDes == null) continue;
          result.properties.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamS7damCommonS7damDamChangeEventListenerInfoBuilder();
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

