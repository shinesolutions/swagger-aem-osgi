//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/com_day_cq_analytics_testandtarget_impl_delete_author_activity_listener_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_analytics_testandtarget_impl_delete_author_activity_listener_info.g.dart';

/// ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo implements Built<ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo, ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties? get properties;

  ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo._();

  factory ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo([void updates(ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfoBuilder b)]) = _$ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo> get serializer => _$ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfoSerializer();
}

class _$ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfoSerializer implements PrimitiveSerializer<ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo> {
  @override
  final Iterable<Type> types = const [ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo, _$ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo];

  @override
  final String wireName = r'ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo object, {
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
        specifiedType: const FullType(ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfoBuilder result,
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
            specifiedType: const FullType.nullable(ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties),
          ) as ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties?;
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
  ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfoBuilder();
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

